package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //Create

    @RequestMapping("/add_employee")
    public String add(){
        Employee employee=new Employee("Ram", "Sales", 5896);
        employeeArrayList.add(employee);
        return "employee added successfully";
    }

    //Get

    @RequestMapping("/get_employee")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    //Update

    @GetMapping("/update_emp")
    public String update(){
        employeeArrayList.get(0).setName("Krishna");
        return "employee updated successfully";
    }

    //Delete

    @GetMapping("/delete_emp")
    public String delete(){
        employeeArrayList.remove(1);
        return "employee deleted successfully";
    }

}
