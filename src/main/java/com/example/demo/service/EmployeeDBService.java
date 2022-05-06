package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeDBService {

    @Autowired
    EmployeeRepository employeeRepository;

public String add(Employee employee){
    employeeRepository.save(employee);
    return "employee added to db successfully";

}

public List<Employee> getAll(){
    return employeeRepository.findAll();
}

public String update(@PathVariable String name,@PathVariable Integer id){
    Employee employee=employeeRepository.getById(id);
    employee.setName("Rakesh");
    employeeRepository.save(employee);
    return "employee added to db";

}


public String delete(@RequestParam Integer id){
    employeeRepository.deleteById(id);
    return "employee deleted in db";
}


}
