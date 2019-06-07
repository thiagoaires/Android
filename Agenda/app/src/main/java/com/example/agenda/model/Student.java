package com.example.agenda.model;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class Student implements Serializable {
    private final String name;
    private final String mail;
    private final String phone;

    public Student(String name, String mail, String phone) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
