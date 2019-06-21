package com.example.agenda.dao;

import android.widget.Toast;

import com.example.agenda.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private final static List<Student> studentList = new ArrayList<>();
    private static int counterId = 1;

    public static void save(Student student) {
        studentList.add(student);
        student.setId(counterId);
        counterId++;

    }

    public void edit(Student student){

        Student findStudent = null;

        for (Student s : studentList) {
            if(s.getId() == student.getId()){
                findStudent = s;
            }
        }

        if(findStudent != null){
            int studentPostion = studentList.indexOf(findStudent);
            studentList.set(studentPostion, student);
        }

    }

    public static List<Student> getAll() {
        return studentList;
    }
}
