package com.thehecklers.sburrestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thehecklers.sburrestdemo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}