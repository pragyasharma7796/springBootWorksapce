package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.SellerEntity;

public interface SellerDao extends JpaRepository<SellerEntity, Integer> {

}
