package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("hello")
    public String hello(){
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num += i;
        }
        int sum = 0;
        for (int i = 0; i < 10 ; i++) {
            sum += i;
        }
        return sum + "";
    }
}
