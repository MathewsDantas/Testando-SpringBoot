package com.example.demo.service;

import com.example.demo.model.entities.Pedido;
import com.example.demo.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void novoPedido(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    public Iterable<Pedido> obterPedidos(){
        return pedidoRepository.findAll();
    }


    public Optional<Pedido> obterPedidoPorId(int id){
        return pedidoRepository.findById(id);
    }


    public void alterarPedido(Pedido pedido){
        pedidoRepository.save(pedido);
    }


    public void deletarPedido(int id){
        pedidoRepository.deleteById(id);
    }
}
