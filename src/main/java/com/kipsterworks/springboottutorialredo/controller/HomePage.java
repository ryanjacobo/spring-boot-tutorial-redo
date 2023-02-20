package com.kipsterworks.springboottutorialredo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String welcomeText(){
        return welcomeMessage;
    }
}
