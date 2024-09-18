package com.clarke.microservice.limits.controller;

import com.clarke.microservice.limits.beans.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    
    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(1,25);
    }
}
