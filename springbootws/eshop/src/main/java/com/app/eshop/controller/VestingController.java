package com.app.eshop.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.eshop.dto.VsetingDto;
import com.app.eshop.service.AllocationService;

@RestController
public class VestingController {
	@Autowired
	private AllocationService allocationService;
	
	@PostMapping(value = "monitization")
	public @ResponseBody Object vesting(@RequestBody VsetingDto dto) {
		System.out.println(dto);
		
		 return allocationService.monetization( dto);
	}
}
