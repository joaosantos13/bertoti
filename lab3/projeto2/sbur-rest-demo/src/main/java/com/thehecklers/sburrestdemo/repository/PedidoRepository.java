package com.thehecklers.sburrestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thehecklers.sburrestdemo.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}