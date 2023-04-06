package com.example.controller;

/*
Build a API service that shares back the current time in
India, USA, UK & Australia
 */
import com.example.bean.Country;
import com.example.service.IgetTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class getTimeController {
    @Autowired
    private IgetTimeService getTimeService;

    @GetMapping("/time")
    public List<Country> getAllCountriesTime(){
        return getTimeService.getCountryTime();
    }
}
