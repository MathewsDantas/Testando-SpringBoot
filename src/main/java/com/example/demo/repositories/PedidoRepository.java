package com.example.demo.repositories;

import com.example.demo.model.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
