package com.example.springbootrestfulwebservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // to make this class a bean, create setters and getters
public class Student {
    private String firstName;
    private String lastName;
}
