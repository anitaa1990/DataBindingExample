package com.an.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.an.databinding.databinding.DataBindingActivity2Binding;
import com.an.databinding.model.UserProfile;

public class DataBindingActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Before Data Binding
//        setContentView(R.layout.activity_main);
//
//        TextView textName = (TextView) findViewById(R.id.txt_name);
//        TextView textSkills = (TextView) findViewById(R.id.txt_skills);
//        TextView textComments = (TextView) findViewById(R.id.txt_comments);
//
//        textViewName.setText("Anitaa Murthy");
//        textSkills.setText("Android, iOS");
//        textComments.setText("Yup, it's that simple");



//      After Data Binding
        DataBindingActivity2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_2);
        UserProfile userProfile = new UserProfile("Anitaa", "Android Developer, iOS Developer", "Yeah! It is that simple!");
        binding.setUserProfile(userProfile);
    }
}
