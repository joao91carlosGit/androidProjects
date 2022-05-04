package com.agendaJC.agenda.dao;

import com.agendaJC.agenda.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private final static List<Student> students = new ArrayList<>();

    public static void save(Student student) {
        students.add((student));
    }

    public List<Student> AllStudents() {
        return new ArrayList<>(students);
    }
}
