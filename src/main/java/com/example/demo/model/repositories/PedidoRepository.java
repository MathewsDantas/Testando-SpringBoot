package com.example.demo.model.repositories;

import com.example.demo.model.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
