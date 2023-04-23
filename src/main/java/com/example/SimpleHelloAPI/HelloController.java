package com.example.SimpleHelloAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloapi")
    public String handleGetMethod () {
        return "Hello, Welcome to the demo Hello API from Spring.";
    }
}
