package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeEntity;

public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Integer> {
	 
}
