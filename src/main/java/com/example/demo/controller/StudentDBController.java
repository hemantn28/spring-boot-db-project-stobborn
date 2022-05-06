package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {


    @Autowired
    StudentDBService studentDBService;

    @RequestMapping(value = "add_student_db", method = RequestMethod.POST)
    public String add(@RequestBody Student student){
        return studentDBService.add(student);

    }

    @RequestMapping(value = "get_student_db", method = RequestMethod.GET)
    public List<Student> getAll(){
        return studentDBService.getAll();
    }

    @RequestMapping(value = "update_student_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name,@PathVariable Integer id){
        studentDBService.update("Kamesh",179);
        return "student updated in db";
    }


    @RequestMapping(value = "delete_student_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        studentDBService.delete(178);
        return "student deleted in db";
    }
}
