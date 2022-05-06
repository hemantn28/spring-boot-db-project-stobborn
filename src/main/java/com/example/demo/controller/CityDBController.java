package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.CityDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityDBController {

    //Create

    @Autowired
    CityDBService cityDBService;

    @RequestMapping(value = "add_city_db", method = RequestMethod.POST)
    public String add(@RequestBody City city){
        return cityDBService.add(city);

    }

    @RequestMapping(value = "get_city_db", method = RequestMethod.GET)
    public List<City> getAll(){
        return cityDBService.getAll();
    }

    @RequestMapping(value = "update_city_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        cityDBService.update("Ujjain",172);
        return "city updated in db";
    }

    @RequestMapping(value = "city_deleted_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        cityDBService.delete(173);
        return "city deleted in db";
    }

}
