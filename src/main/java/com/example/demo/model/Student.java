package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Student_std")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String section;
    private int rollNo;

    public Student() {
    }

    public Student(String name, String section, int rollNo) {
        this.name = name;
        this.section = section;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
