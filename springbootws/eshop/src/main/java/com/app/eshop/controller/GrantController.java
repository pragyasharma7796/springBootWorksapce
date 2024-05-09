package com.app.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.eshop.dto.GrantDto;
import com.app.eshop.service.GrantService;
@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class GrantController {
	@Autowired
	private GrantService grantService;
	
	@PostMapping(value ="/savedGrant")
	public void save(@RequestBody List<GrantDto> dtos) {
		grantService.processGrant(dtos);
	}
	
	@PostMapping(value="/approvegrant")
	public void aprove(@RequestBody List<Long> ids) {
		grantService.approveGrant(ids);
	}
}