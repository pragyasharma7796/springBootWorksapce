package com.app.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.entity.CategoryEntity;
import com.app.demo.entity.SubCategoryEntity;

public interface SubCategoryDao extends JpaRepository<SubCategoryEntity, Integer> {
	
	/*
	 * @Query("select  from SubCategoryEntity where category=?1")
	 * List<SubCategoryEntity> findByCategory(CategoryEntity c);
	 */
}
