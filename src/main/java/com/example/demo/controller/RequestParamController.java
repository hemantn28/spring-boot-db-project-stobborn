package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @GetMapping("/make")
    public String message(@RequestParam String name){

        return "welcome to request param"+name;
    }

    @RequestMapping("/check_salary")
    public  String mySalary(@RequestParam int salary){
        return "your salary is "+salary;
    }


    @GetMapping("/check_marks")
    public String myMarks(@RequestParam int marks){
        return "your marks are "+marks;

    }

    @GetMapping("/my_speed")
    public String checkSpeed(@RequestParam int speed){
        if (speed>120){
            return "you are driving very fast";
        }
        else if (speed>90){
            return "You are driving fast";
        }
        else if (speed>70){
            return "you are driving moderate";
        }
        else if (speed>50){
            return "you are driving average";
        }
        else{
            return "you are driving";
        }

    }

    @RequestMapping("/addition")
    public String add(@RequestParam int a,@RequestParam int b){
        return "addition is "+(a+b);
    }


    @GetMapping("/minus")
    public String subtraction(@RequestParam int a,@RequestParam int b){
        return "subtraction is "+(a-b);
    }

    @RequestMapping("/do_divide")
    public String divide(@RequestParam int a,@RequestParam int b){
        return "division is "+(a/b);
    }
}
