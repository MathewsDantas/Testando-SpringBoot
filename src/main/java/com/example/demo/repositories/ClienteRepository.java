package com.example.demo.repositories;

import com.example.demo.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
