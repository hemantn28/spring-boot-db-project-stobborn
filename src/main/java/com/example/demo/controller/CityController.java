package com.example.demo.controller;

import com.example.demo.model.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityController {

    ArrayList<City> cityArrayList=new ArrayList<>();

    //Create

    @RequestMapping("/add_city")
    public String add(@RequestBody City city){
       // City city=new City("Agra","U.P",856354);
        cityArrayList.add(city);
        return "city added";
    }

    //get

    @RequestMapping("/get_city")
    public ArrayList<City> getCityArrayList(){

        return cityArrayList;
    }

    //Update

    @RequestMapping("/update_city")
    public String update(){
        cityArrayList.get(0).setName("Indore");
        return "city updated ";
    }

    //Delete

    @RequestMapping("/delete_city")
    public String delete(){
        cityArrayList.remove(0);
        return "city deleted";
    }
}
