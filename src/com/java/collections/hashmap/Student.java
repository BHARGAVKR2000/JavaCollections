package com.java.collections.hashmap;

import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private String courseName;

    public Student(int rollNo, String name, String courseName) {
        this.rollNo = rollNo;
        this.name = name;
        this.courseName = courseName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && Objects.equals(courseName, student.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return
                " rollNo='" + rollNo + '\''+
                " name='" + name + '\'' +
                ", courseName='" + courseName;
    }
}
