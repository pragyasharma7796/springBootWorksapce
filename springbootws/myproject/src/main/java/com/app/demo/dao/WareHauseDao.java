package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.WareHouseEntity;

public interface WareHauseDao extends JpaRepository<WareHouseEntity, Integer> {

}
