package com.clarke.microservice.limits.controller;

import com.clarke.microservice.limits.AppConfig;
import com.clarke.microservice.limits.beans.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    
    @Autowired
    private AppConfig config;
    
    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(config.getMin(),config.getMax());
    }
}
