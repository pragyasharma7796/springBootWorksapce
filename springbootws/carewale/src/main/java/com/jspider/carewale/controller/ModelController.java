package com.jspider.carewale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.carewale.constant.AppConstant;
import com.jspider.carewale.entity.Model;
import com.jspider.carewale.service.ModelService;

@RestController
public class ModelController {
	@Autowired
	private ModelService modelService;
	
	@PostMapping(value = AppConstant.SAVE_ALL_MODELS)
	public @ResponseBody List<Model> saveAll(@RequestBody List<Model> models){
		return modelService.saveAll(models);
	}
	
	@GetMapping(value = AppConstant.GET_ALL_MODEL_LIST)
	public @ResponseBody List<Model> getAll(){
		return modelService.getAll();
	}
}
