package com.example.demo.controllers;

import com.example.demo.model.entities.Pedido;
import com.example.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido novoPedido(@RequestBody @Valid Pedido pedido){
        pedidoService.novoPedido(pedido);
        return pedido;
    }

    @GetMapping
    public Iterable<Pedido> obterPedidos(){
        return pedidoService.obterPedidos();
    }

    @GetMapping(path = "/{id}")
    public Optional<Pedido> obterPedidoPorId(@PathVariable int id){
        return pedidoService.obterPedidoPorId(id);
    }

    @PutMapping
    public Pedido alterarPedido(@RequestBody @Valid Pedido pedido){
        pedidoService.alterarPedido(pedido);
        return pedido;
    }

    @DeleteMapping(path = "{id}")
    public void deletarPedido(@PathVariable int id){
        pedidoService.deletarPedido(id);
    }

}
