package com.example.SimpleHelloAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HiController {

    @RestController
    public class HelloController {

        @GetMapping("/hiapi")
        public String handleGetMethod () {
            return "Hi, Welcome to the demo Hello API from Spring.";
        }
    }
}
