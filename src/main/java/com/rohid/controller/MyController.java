package com.rohid.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rohid.model.City;
import com.rohid.services.ICityService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {

        List<City> cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }
}