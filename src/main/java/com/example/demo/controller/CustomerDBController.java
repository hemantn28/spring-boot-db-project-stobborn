package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerDBController {


    @Autowired
    CustomerDBService service;

    @RequestMapping(value = "add_customer_db", method = RequestMethod.POST)
    public String add(@RequestBody Customer customer){
       return service.add(customer);
    }

    @RequestMapping(value = "get_customer_db", method = RequestMethod.GET)
    public List<Customer> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "update_customer_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name, @RequestParam Integer id){
        service.update("Himani",182);
        return "customer updated in db";

    }

    @RequestMapping(value = "delete_customer_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        service.delete(181);
        return "student deleted in db";
    }
}
