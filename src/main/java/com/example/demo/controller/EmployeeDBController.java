package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {

    @Autowired
    EmployeeDBService employeeDBService;

    @RequestMapping(value = "add_employee_db", method = RequestMethod.POST)
    public String add(@RequestBody Employee employee){
       return employeeDBService.add(employee);

    }

    @RequestMapping(value = "get_employee_db", method = RequestMethod.GET)
    public List<Employee> getAll(){
        return employeeDBService.getAll();

    }

    @RequestMapping(value = "update_employee_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @PathVariable Integer id){
        employeeDBService.update("Rakesh",163);
        return "employee updated in db";
    }

    @RequestMapping(value= "delete_employee_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        employeeDBService.delete(164);
        return "employee deleted in db";


    }

    }

