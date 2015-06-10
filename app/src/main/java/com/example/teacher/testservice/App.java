package com.example.teacher.testservice;

import android.app.Application;

public class App extends Application {

    private String name;

    @Override
    public void onCreate() {
        super.onCreate();

        name = "test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
