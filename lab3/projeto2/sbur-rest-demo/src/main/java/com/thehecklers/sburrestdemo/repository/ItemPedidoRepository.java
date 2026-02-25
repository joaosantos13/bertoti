package com.thehecklers.sburrestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thehecklers.sburrestdemo.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}