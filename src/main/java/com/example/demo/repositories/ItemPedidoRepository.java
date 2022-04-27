package com.example.demo.repositories;

import com.example.demo.model.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer> {
}
