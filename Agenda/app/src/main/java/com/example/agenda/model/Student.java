package com.example.agenda.model;

import android.support.annotation.NonNull;

public class Student {
    private final String name;
    private final String mail;
    private final String phone;

    public Student(String name, String mail, String phone) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
