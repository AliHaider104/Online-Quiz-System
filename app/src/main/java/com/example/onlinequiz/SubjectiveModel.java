package com.example.onlinequiz;

public class SubjectiveModel {
    String description;
    String description1;

    public SubjectiveModel() {
    }

    public SubjectiveModel(String description,String description1) {
        this.description = description;
        this.description1=description1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
