package com.example.demo.service;


import com.example.demo.model.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void novoCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public Iterable<Cliente> obterCliente()
    {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obterClientePorId(int id){
        return clienteRepository.findById(id);
    }

    public void alterarCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void deletarCliente(int id){
        clienteRepository.deleteById(id);
    }
}
