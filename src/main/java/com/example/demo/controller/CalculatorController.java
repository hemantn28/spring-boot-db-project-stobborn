package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/plus")
    public String add(){
        int a=4;
        int b=5;
        return "addition is "+(a+b);
    }

    @RequestMapping("/minus")
    public int subtraction(){
        int a=7;
        int b=14;
        int c=b-a;
        return c;
    }

    @GetMapping("/multiplication")
    public String multiply(){
        int a=7;
        int b=8;
        int c=a*b;
        return "multiplication is "+c;
    }

    @RequestMapping("/division")
    public String divide(){
        int a=8;
        int b=4;
        int c=a/b;
        return "division is "+c;
    }


}
