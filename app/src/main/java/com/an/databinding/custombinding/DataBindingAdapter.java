package com.an.databinding.custombinding;

import android.databinding.BindingAdapter;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Toast;

public class DataBindingAdapter {

    @BindingAdapter("toast")
    public static void showToast(View view, String toast) {
        if(toast != null && !toast.isEmpty()) {
            Toast.makeText(view.getContext(), toast, Toast.LENGTH_SHORT).show();
        }
    }


    @BindingAdapter("error")
    public static void showErrorMessage(TextInputLayout view, String message) {
        view.setError(message);
    }
}
