package com.example.SimpleHelloAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hiapi")
    public String handleGetMethod () {
        return "Hi, Welcome to the demo Hello API from Spring.";
    }
}