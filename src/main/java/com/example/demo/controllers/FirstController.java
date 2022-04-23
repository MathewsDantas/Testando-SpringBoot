package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = "/ola")
    public String Ola()
    {
        return "Olá, Spring Boot! ";
    }

    @GetMapping
    public String Dale()
    {
        return "Dale";
    }
}
