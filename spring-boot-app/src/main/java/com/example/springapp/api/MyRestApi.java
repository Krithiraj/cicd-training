package com.example.springapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {

    @GetMapping
    public String sayHello(){
        return "Hello, Testing Sprint Book Application";
    }


}
