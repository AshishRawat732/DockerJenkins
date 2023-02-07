package com.ashish.Dockerdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test-docker")
    public String getData(){
        System.out.println("In docker tutorial project");
        return "In docker tutorial project";

    }
}
