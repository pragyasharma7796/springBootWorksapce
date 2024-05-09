package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.CategoryEntity;

public interface CategoryDao extends JpaRepository<CategoryEntity, Integer>{

}
