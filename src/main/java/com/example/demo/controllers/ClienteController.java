package com.example.demo.controllers;

import com.example.demo.model.entities.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping(path = "/clientes")
    public Cliente obterCleinte()
    {
        return new Cliente(1,"Mathews", "000.xxx.xxx-xx");
    }
}
