package com.example.springbootrestfulwebservices.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller // make the class to be  recognized by spring mvc
//@ResponseBody // used to make this class return  jso of xml files
@RestController // is a combination of the two annotation above
public class HelloWorldController {
    // handles get http request.  this is simple a rest
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "helloworld";
    }
}
