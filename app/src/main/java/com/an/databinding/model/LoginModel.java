package com.an.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.an.databinding.BR;

public class LoginModel extends BaseObservable {


    private String email;
    private String password;
    private String loginMessage;


    private String emailError;
    private String passwordError;

    @Bindable
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Bindable
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Bindable
    public String getEmailError() {
        return emailError;
    }


    @Bindable
    public String getPasswordError() {
        return passwordError;
    }


    @Bindable
    public String getLoginMessage() {
        return loginMessage;
    }


    public void login(LoginModel loginModel) {
        if(loginModel.getEmail() == null || loginModel.getEmail().isEmpty()) {
            updateEmailError("Email field cannot be empty");
            return;
        }

        if(loginModel.getPassword() == null || loginModel.getPassword().isEmpty()) {
            updatePasswordError("Password field cannot be empty");
            updateEmailError(null);
            return;
        }

        loginMessage = "Login Success!";
        updateEmailError(null);
        updatePasswordError(null);
        notifyPropertyChanged(BR.passwordError);
        notifyPropertyChanged(BR.emailError);
        notifyPropertyChanged(BR.loginMessage);
    }



    public void reset() {
        email = null;
        password = null;
        emailError = null;
        passwordError = null;
        updatePasswordError(null);
        updateEmailError(null);
        notifyPropertyChanged(BR.email);
        notifyPropertyChanged(BR.password);
    }


    private void updateEmailError(String error) {
        emailError = error;
        notifyPropertyChanged(BR.emailError);
    }

    private void updatePasswordError(String error) {
        passwordError = error;
        notifyPropertyChanged(BR.passwordError);
    }
}
