package com.example.agenda.dao;

import com.example.agenda.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private final static List<Student> studentList = new ArrayList<>();

    public static void save(Student student) {
        studentList.add(student);
    }

    public static List<Student> getAll() {
        return studentList;
    }
}
