package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentDBService {

    @Autowired
    StudentRepository studentRepository;

    public String add(Student student){
        studentRepository.save(student);
        return "student added to db";

    }


    public List<Student> getAll(){
        return studentRepository.findAll();
    }


    public String update(@PathVariable String name,@PathVariable Integer id){
        Student student=studentRepository.getById(id);
        student.setName("Kamesh");
        studentRepository.save(student);
        return "student updated in db";
    }


    public String delete(@RequestParam Integer id){
        studentRepository.deleteById(id);
        return "student deleted in db";
    }
}
