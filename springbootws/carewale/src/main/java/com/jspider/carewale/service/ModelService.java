package com.jspider.carewale.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jspider.carewale.entity.Model;
import com.jspider.carewale.repository.ModelRepository;

@Service
public class ModelService {
	
	public ModelRepository modelRepository;
	
	public List<Model> saveAll(List<Model> modelList){
		return modelRepository.saveAll(modelList);
		
	}
	
	public List<Model> getAll(){
		return modelRepository.findAll();
	}
}
