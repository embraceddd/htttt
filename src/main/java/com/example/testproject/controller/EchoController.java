package com.example.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/returnEcho")
    public String echo(@RequestBody String body) {
        return body;
    }
}
