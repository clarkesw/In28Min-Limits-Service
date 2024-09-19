package com.clarke.microservice.limits.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter 
@ToString 
@AllArgsConstructor
public class Limits {
    private int min;
    private int max;
}
