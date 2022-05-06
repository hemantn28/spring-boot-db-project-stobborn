package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String message(){

        return "welcome to spring boot";
    }

    @RequestMapping("/test")
    public String welcomeTo(){
        return "Hello, Welcome ...";
    }

    @GetMapping("/going")
    public String trip(){
        return "trip to Agra...";
    }

    @GetMapping("/number")
    public int makeNumber(){
        return 54;
    }

    @GetMapping("/salary")
    public double your_salary(){
        return 965384.521;
    }

    @RequestMapping("/mobile")
    public long mobileNumber(){
        return 9876325698l;
    }

    @GetMapping("/price")
    public float price(){
        return 89.52f;
    }
}
