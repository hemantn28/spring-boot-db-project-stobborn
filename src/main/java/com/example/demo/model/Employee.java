package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Emp_Com")
public class Employee {

    @Id
    @GeneratedValue
    int id;
    String name;
    String dept;

    public Employee() {
    }

    public Employee(String name, String dept, int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
