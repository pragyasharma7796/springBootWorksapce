package com.jspider.firstSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jspider.firstSpringBoot.constant.AppConstant;
import com.jspider.firstSpringBoot.dto.RegisterDto;
import com.jspider.firstSpringBoot.entity.Register;
import com.jspider.firstSpringBoot.service.RegisterService;

@RestController
@RequestMapping(value = AppConstant.FORWORD_SLASH)
public class RegisterController {
	@Autowired
	private RegisterService service;

	@PostMapping(value = AppConstant.SAVE_REGISTER_DETAILS)
	public Register saveUser(@RequestBody Register register) {
		return service.addRegister(register);
	}

	@GetMapping(value = AppConstant.GET_ALL_REGISTER_DETAILS)
	public @ResponseBody List<Register> getAllRegiser() {
		return service.getAllData();
	}

	@GetMapping(value = AppConstant.FIND_BY_ID)
	public @ResponseBody Register userGetById(@RequestHeader("id") Long id) {
		return service.getById(id);
	}

	
	  @DeleteMapping(value=AppConstant.DELETE_BY_ID)
	  public void userDeleteById(@RequestHeader("id") Long id) {
		  service.deleteById(id); 
	  }
	 
	  @PostMapping(value=AppConstant.SAVE_ALL_REGISTERS_DETAILS)
	  public @ResponseBody List<Register> saveALL(@RequestBody List<Register> list){
		  return service.save(list);
	  }
	  
	  @PutMapping(value = AppConstant.UPDATE_USERS)
	 public void update(@RequestBody List<RegisterDto> registerDtos) {
		 service.update(registerDtos);
	 }
	  
}
