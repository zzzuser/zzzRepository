package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("hello java");
        return "hello world";

    }
}
