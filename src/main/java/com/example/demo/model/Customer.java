package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Customer_cust")
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String colony;

    public Customer() {
    }

    public Customer(int id, String name, int age, String colony) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.colony = colony;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }
}
