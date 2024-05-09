package com.app.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.eshop.entity.Plan;
import com.app.eshop.service.PlanService;

@RestController
public class PlanController {
	@Autowired
	private PlanService planService;
	
	@PostMapping(value="saveplan")
	public void save(@RequestBody Plan plan) {
		planService.save(plan);
	}
}