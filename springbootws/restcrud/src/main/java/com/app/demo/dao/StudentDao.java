package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity, Integer>{
	
}
