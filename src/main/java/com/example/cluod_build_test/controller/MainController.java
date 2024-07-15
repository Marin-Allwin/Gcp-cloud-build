package com.example.cluod_build_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Good morning , have a nice day";
    }
}
