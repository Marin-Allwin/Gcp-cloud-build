package com.example.cluod_build_test.controller;

import com.example.cluod_build_test.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Good morning , have a nice day";
    }

    @GetMapping("/wish")
    public String wish() {
        return "Happy birthday.......!";
    }

    @GetMapping("/ask")
    public String ask() {
        return "How is your day....?";
    }

    @PostMapping("/set")
    public void setValue(@RequestParam String key, @RequestParam String value) {
        redisService.setValue(key, value);
    }

    @GetMapping("/get")
    public String getValue(@RequestParam String key) {
        return redisService.getValue(key);
    }

    @DeleteMapping("/delete")
    public void deleteValue(@RequestParam String key) {
        redisService.deleteValue(key);
    }
}
