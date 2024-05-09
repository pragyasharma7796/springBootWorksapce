package com.app.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.eshop.dto.ExersicDto;
import com.app.eshop.service.AllocationService;
import com.app.eshop.service.ExersciseService;

@RestController
public class AllocationController {
	@Autowired
	private AllocationService allocationService;
	
	@Autowired
	private ExersciseService exersciseService;
	@PostMapping(value = "approveAllocation")
	public void approveAllocation(@RequestBody List<Long> list) {
		allocationService.approveAllocation(list);
	}
	
	@PostMapping("soldShares")
	public void soldOption(@RequestBody ExersicDto dto) {
		exersciseService.sellOption(dto);
	}
}
