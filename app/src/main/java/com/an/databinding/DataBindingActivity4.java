package com.an.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.an.databinding.databinding.ActivityDataBinding4Binding;
import com.an.databinding.model.StudentProfile;
import com.an.databinding.recyclerview.DataBinding4Adapter;

import java.util.ArrayList;
import java.util.List;

public class DataBindingActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityDataBinding4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_4);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<StudentProfile> list = new ArrayList<>();
        list.add(new StudentProfile("Anitaa", "Psychology", "Be the change you want to see in the world"));
        list.add(new StudentProfile("Steve Jobs", "Physics", "I want to put a ding in the universe."));
        list.add(new StudentProfile("Steve Jobs", "Physics", "The first step to establish that mething is possible; then probability will occur"));

        DataBinding4Adapter adapter = new DataBinding4Adapter(this, list);
        binding.recyclerView.setAdapter(adapter);
    }
}
