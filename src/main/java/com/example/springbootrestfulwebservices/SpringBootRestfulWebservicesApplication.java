package com.example.springbootrestfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestfulWebservicesApplication {
    // @SpringBootApplication has 3 annotations
    //@ Spring boot @configuration to make a class a configurations
    // this is where we define our beans
    // @ enables authoconfiguration
    // @ component

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestfulWebservicesApplication.class, args);
    }

}
