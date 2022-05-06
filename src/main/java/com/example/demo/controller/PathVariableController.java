package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {


    @GetMapping("/type/{name}")
    public String hello(@PathVariable String name){
        return "welcome to path variable "+name;
    }

    @RequestMapping("/going/{place}")
    public String go(@PathVariable String place){
        return "You are going to "+place;
    }

    @GetMapping("/package/{salary}")
    public String salary(@PathVariable double salary){
        return "your salary is "+salary;
    }

    @RequestMapping("/sam/{model}")
    public String mobile(@PathVariable String model){
        return "my mobile is of "+model;
    }


    @RequestMapping("/living/{colony}")
    public String locality(@PathVariable String colony){
        return "you are living in "+colony;
    }

    @GetMapping("/my_age/{age}")
    public String checkAge(@PathVariable int age){
        if(age>=18){
            return "Person is young";
        }
        else{
            return "person is child";
        }
    }

    @RequestMapping("/the_price/{price}")
    public String checkPrice(@PathVariable double price){
        if (price>1000){
            return "product is costly";
        }
        else if (price>800){
            return "product is some costly";
        }
        else if (price>500){
            return "product is moderate";
        }
        else if (price>200){
            return "product is cheap";
        }
        else{
            return "product exist in the market";
        }
    }


    @GetMapping("/my_marks/{marks}")
    public String checkmarks(@PathVariable int marks){
        if (marks>95){
            return "you are outstanding student";
        }
        else if (marks>80){
            return "you are intelligent student";
        }
        else if (marks>70){
            return "you are brilliant student";
        }
        else if (marks>50){
            return "you are good student";
        }
        else{
            return "you are a student";
        }
    }

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable int b){
        return "addition is "+(a+b);
    }

    @GetMapping("/subtract/{a}/{b}")
    public String subtraction(@PathVariable int a,@PathVariable int b){
        return "subtraction is "+(a-b);
    }

    @RequestMapping("/divide/{a}/{b}")
    public  String divide(@PathVariable int a,@PathVariable int b){
        return "division is "+(a/b);
    }
}
