package com.example.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }

    @GetMapping("/systems")
    public String showSystems(){
        return "systems";
    }
}
