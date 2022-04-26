package com.example.demo.controllers;

import com.example.demo.model.entities.ItemPedido;
import com.example.demo.model.repositories.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/itempedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @PostMapping
    public ItemPedido novoItemPedido(@RequestBody ItemPedido itemPedido){
        itemPedidoRepository.save(itemPedido);
        return itemPedido;
    }

    @GetMapping
    public List<ItemPedido> obterItemPedidos(){
        return itemPedidoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<ItemPedido> obterItemPedidoPorId(@PathVariable int id){
        return itemPedidoRepository.findById(id);
    }

    @PutMapping
    public ItemPedido alterarItemPedido(@RequestBody ItemPedido itemPedido){
        itemPedidoRepository.save(itemPedido);
        return itemPedido;
    }

    @DeleteMapping("/{id}")
    public void deletarItemPedido(@PathVariable int id){
        itemPedidoRepository.deleteById(id);
    }
}
