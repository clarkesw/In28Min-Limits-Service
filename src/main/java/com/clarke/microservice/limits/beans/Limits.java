package com.clarke.microservice.limits.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
    private int min;
    private int max;
}
