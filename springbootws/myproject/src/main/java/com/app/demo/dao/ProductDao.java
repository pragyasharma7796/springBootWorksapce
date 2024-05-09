package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity, Integer> {

}
