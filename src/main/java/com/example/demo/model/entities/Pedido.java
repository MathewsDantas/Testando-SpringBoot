package com.example.demo.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date data;

    @ManyToOne
    @NotNull
    private Cliente cliente;

    public Pedido(){
        this(new Date());
    }

    public Pedido(Cliente cliente) {
        this.data = new Date();
        this.cliente = cliente;
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
