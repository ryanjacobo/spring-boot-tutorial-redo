package com.kipsterworks.springboottutorialredo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping("/")
    public String welcomeText(){
        return "Welcome to the Home page! Auto refresh enabled.";
    }
}
