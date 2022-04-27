package com.example.demo.service;

import com.example.demo.model.entities.ItemPedido;
import com.example.demo.repositories.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public void novoItemPedido(ItemPedido itemPedido){
        itemPedidoRepository.save(itemPedido);
    }

    public List<ItemPedido> obterItemPedidos(){
        return itemPedidoRepository.findAll();
    }

    public Optional<ItemPedido> obterItemPedidoPorId(int id){
        return itemPedidoRepository.findById(id);
    }

    public void alterarItemPedido(ItemPedido itemPedido){
        itemPedidoRepository.save(itemPedido);
    }

    public void deletarItemPedido(int id){
        itemPedidoRepository.deleteById(id);
    }
}
