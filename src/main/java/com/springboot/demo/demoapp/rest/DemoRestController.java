package com.springboot.demo.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String getMethoddemo()
    {
        return "Hello Asawari!!";
    }

    @GetMapping("/name")
    public String getName()
    {
        return "Asawari";
    }
}
