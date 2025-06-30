package com.example.setup_junit_eclipse_02;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public boolean hasPassed() {
        return marks >= 40;
    }

    public String getGrade() {
        if (marks >= 85) return "A";
        if (marks >= 70) return "B";
        if (marks >= 50) return "C";
        return "D";
    }

    public String getName() {
        return name;
    }
}

