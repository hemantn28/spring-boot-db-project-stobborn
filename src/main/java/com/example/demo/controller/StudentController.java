package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {


    ArrayList<Student> studentArrayList=new ArrayList<>();

    //Create ==> Add

    @GetMapping("/add_student")
    public String add(){
        Student student=new Student("Raj","PCB",50);
        studentArrayList.add(student);
        return "student added successfully";
    }


    //Read ==> Get

    @RequestMapping("/get_student")
    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }

    //Update


    @GetMapping("/update_student")
    public String update(){
        studentArrayList.get(0).setName("Rakesh");
        return "name updated successfully";
    }


    //Delete

    @RequestMapping("/delete_student")
    public String delete(){
        studentArrayList.remove(1);
        return "student deleted successfully";
    }


}
