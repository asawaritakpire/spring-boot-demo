package com.springboot.demo.demoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class DemoRestController {



    @Value("${author.name}")
    private String authorName;

    @GetMapping("/")
    public String getMethoddemo()
    {
        return "Hello " + authorName;
    }

    @GetMapping("/name")
    public String getName()
    {
        return authorName;
    }
}
