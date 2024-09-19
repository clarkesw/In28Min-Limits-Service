package com.clarke.microservice.limits;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Getter 
@Setter 
@ToString 
@Configuration
public class AppConfig {
    @Value("${limits-servrice.min}")
    private int min;
    
    @Value("${limits-servrice.max}")
    private int max;
}
