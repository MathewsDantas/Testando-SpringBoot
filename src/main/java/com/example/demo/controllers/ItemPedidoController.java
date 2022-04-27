package com.example.demo.controllers;

import com.example.demo.model.entities.ItemPedido;
import com.example.demo.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/itempedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @PostMapping
    public ItemPedido novoItemPedido(@RequestBody ItemPedido itemPedido){
        itemPedidoService.novoItemPedido(itemPedido);
        return itemPedido;
    }

    @GetMapping
    public List<ItemPedido> obterItemPedidos(){
        return itemPedidoService.obterItemPedidos();
    }

    @GetMapping(path = "/{id}")
    public Optional<ItemPedido> obterItemPedidoPorId(@PathVariable int id){
        return itemPedidoService.obterItemPedidoPorId(id);
    }

    @PutMapping
    public ItemPedido alterarItemPedido(@RequestBody ItemPedido itemPedido){
        itemPedidoService.alterarItemPedido(itemPedido);
        return itemPedido;
    }

    @DeleteMapping("/{id}")
    public void deletarItemPedido(@PathVariable int id){
        itemPedidoService.deletarItemPedido(id);
    }
}
