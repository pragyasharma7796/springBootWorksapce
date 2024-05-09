package com.jspider.carewale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.carewale.entity.Brand;
import com.jspider.carewale.repository.BrandRepository;

@Service
public class BrandService {
	@Autowired
	BrandRepository repository;
	
	public Brand save(Brand brand) {
		
		return repository.save(brand);
	}
	
	public List<Brand> getAll(){
		return repository.findAll(); 
	}
}
