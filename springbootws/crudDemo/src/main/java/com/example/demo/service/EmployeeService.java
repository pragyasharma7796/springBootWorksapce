package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDTO;

public interface EmployeeService {
	 void save(EmployeeDTO e);
	 List<EmployeeDTO> getAll();
	 EmployeeDTO findById(Integer id);
	 void update(EmployeeDTO e);
	 void delete(Integer id);
	// List<EmployeeDTO> searchByNameAndCity(String name,String city);
}
