package com.example.demo.controllers;

import com.example.demo.model.entities.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente novoCliente(@RequestBody @Valid Cliente cliente){
        clienteService.novoCliente(cliente);
        return cliente;
    }

    @GetMapping
    public Iterable<Cliente> obterCliente()
    {
        return clienteService.obterCliente();
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> obterClientePorId(@PathVariable int id){
        return clienteService.obterClientePorId(id);
    }

    @PutMapping
    public Cliente alterarCliente(@RequestBody @Valid Cliente cliente){
        clienteService.alterarCliente(cliente);
        return cliente;
    }

    @DeleteMapping(path = "/{id}")
    public void deletarCliente(@PathVariable int id){
        clienteService.deletarCliente(id);
    }
}
