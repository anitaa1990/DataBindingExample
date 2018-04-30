package com.an.databinding.model;

public class UserProfile {


    private String name;
    private String skills;
    private String comments;
    public UserProfile(String name, String skills, String comments) {
        this.name = name;
        this.skills = skills;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
