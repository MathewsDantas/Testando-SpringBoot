package com.example.demo.controllers;

import com.example.demo.model.entities.Cliente;
import com.example.demo.model.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente novoCliente(@RequestBody @Valid Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    @GetMapping
    public Iterable<Cliente> obterCliente()
    {
        return clienteRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> obterClientePorId(@PathVariable int id){
        return clienteRepository.findById(id);
    }

    @PutMapping
    public Cliente alterarCliente(@RequestBody @Valid Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    @DeleteMapping(path = "/{id}")
    public void deletarCliente(@PathVariable int id){
        clienteRepository.deleteById(id);
    }
}
