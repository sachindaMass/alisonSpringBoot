package com.example.alisonspringboot.controller;

import com.example.alisonspringboot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(path = "hello/{name}")
    public String hello(String name){
       return greetingService.sayHello(name);
    }
}
