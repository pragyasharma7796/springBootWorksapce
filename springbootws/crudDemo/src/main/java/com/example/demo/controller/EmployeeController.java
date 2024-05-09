package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("emps")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public List<EmployeeDTO> getAll() {
		List<EmployeeDTO> emps = service.getAll();
		System.out.println(emps);
		return emps;
	}
	
	@GetMapping("/{id}")
	public EmployeeDTO getById(@PathVariable Integer id) {
			return service.findById(id);
		
	}
}
