package com.example.teacher.testservice;

public class Info {

    private static Info instance;

    private String name = "";
    private String secondName = "";
    private String email = "";

    public static synchronized Info getInstance() {
        if (instance == null) {
            instance = new Info();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
