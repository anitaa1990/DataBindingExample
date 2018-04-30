package com.an.databinding.presenter;

import android.content.Intent;
import android.view.View;

import com.an.databinding.DataBindingActivity1;
import com.an.databinding.DataBindingActivity2;
import com.an.databinding.DataBindingActivity3;
import com.an.databinding.DataBindingActivity4;

public class MainPresenter {

    public void onClickButton1(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity1.class));
    }

    public void onClickButton2(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity2.class));
    }

    public void onClickButton3(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity3.class));
    }

    public void onClickButton4(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity4.class));
    }

    public void onClickButton5(View view) {

    }
}
