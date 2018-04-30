package com.an.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.an.databinding.BR;

public class StudentProfile extends BaseObservable {

    private String name;
    private String major;
    private String quote;
    public StudentProfile(String name, String major, String quote) {
        this.name = name;
        this.major = major;
        this.quote = quote;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getMajor() {
        return major;
    }

    @Bindable
    public String getQuote() {
        return quote;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setMajor(String major) {
        this.major = major;
        notifyPropertyChanged(BR.major);
    }

    public void setQuote(String quote) {
        this.quote = quote;
        notifyPropertyChanged(BR.quote);
    }
}
