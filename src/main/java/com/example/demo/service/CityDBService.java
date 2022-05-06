package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CityDBService {

    @Autowired
    CityRepository cityRepository;

public String add(City city){
    cityRepository.save(city);
    return "city added to db";
}


public List<City> getAll(){
  return   cityRepository.findAll();
}


public String update(@RequestParam String name,@RequestParam Integer id){
City city=cityRepository.getById(id);
city.setName("Ujjain");
cityRepository.save(city);
return "city updated in db";
}


public String delete(@RequestParam Integer id){
    cityRepository.deleteById(id);
    return "city deleted in db";
}
}
