package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CustomerDBService {

    @Autowired
    CustomerRepository repository;

    public String add(Customer customer){
         repository.save(customer);
         return "customer added to db";
    }


    public List<Customer> getAll(){
        return repository.findAll();
    }


    public String update(@RequestParam String name,@RequestParam Integer id){
        Customer customer=repository.getById(id);
        customer.setName("Himani");
        repository.save(customer);
        return "customer updated in db";
    }



    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "customer updated in db";
    }
}
