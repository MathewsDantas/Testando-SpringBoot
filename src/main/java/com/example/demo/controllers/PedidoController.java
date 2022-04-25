package com.example.demo.controllers;

import com.example.demo.model.entities.Pedido;
import com.example.demo.model.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    public Pedido novoPedido(@RequestBody @Valid Pedido pedido){
        pedidoRepository.save(pedido);
        return pedido;
    }

    @GetMapping
    public Iterable<Pedido> obterPedidos(){
        return pedidoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Pedido> obterPedidoPorId(@PathVariable int id){
        return pedidoRepository.findById(id);
    }

    @PutMapping
    public Pedido alterarPedido(@RequestBody @Valid Pedido pedido){
        pedidoRepository.save(pedido);
        return pedido;
    }

    @DeleteMapping(path = "{id}")
    public void deletarPedido(@PathVariable int id){
        pedidoRepository.deleteById(id);
    }

}
