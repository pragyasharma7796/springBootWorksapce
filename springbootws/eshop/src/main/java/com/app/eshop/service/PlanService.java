package com.app.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.eshop.entity.Plan;
import com.app.eshop.repository.PlanRepository;

@Service
public class PlanService {
	@Autowired
	private PlanRepository planRepository;
	public void save(Plan plan) {
		planRepository.save(plan);
	}
	public Plan getCurrentPlan(){
		return planRepository.findByIsCurrentPlan(true);
	}
	
	public Plan getPlanById(Long id) {
		return planRepository.findById(id).get();
	}
	public void updatePlan(Plan plan) {
		
		planRepository.save(plan);
	}
}
