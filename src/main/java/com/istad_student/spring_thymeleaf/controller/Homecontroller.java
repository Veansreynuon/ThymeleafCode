package com.istad_student.spring_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/index")
    public String getHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String registerForm(){
        return "registerForm";
    }
}
