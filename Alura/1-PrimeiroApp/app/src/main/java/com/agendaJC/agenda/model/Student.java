package com.agendaJC.agenda.model;

public class Student {
    private final String name;
    private final String number;
    private final String email;

    public Student(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}
