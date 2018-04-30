package com.an.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.an.databinding.databinding.ActivityDataBinding1Binding;

public class DataBindingActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        /*
         * Binding class will be generated based on same name of layout file
         * (e.g. activity_data_binding_1’s binding class will be generated ActivityDataBinding1Binding)
         *
         * */

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
        ActivityDataBinding1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_1);
        binding.txtName.setText("Anitaa Murthy");
        binding.txtSkills.setText("Android, iOS");
        binding.txtComments.setText("Yup, it's that simple");
    }
}
