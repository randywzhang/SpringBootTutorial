package com.randywzhang.SpringBootTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // maps the web directory '/' to index() method
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
