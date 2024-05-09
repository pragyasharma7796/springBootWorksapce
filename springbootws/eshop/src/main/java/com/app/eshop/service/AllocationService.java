package com.app.eshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.app.eshop.controller.VestingController;
import com.app.eshop.dto.Output;
import com.app.eshop.dto.VsetingDto;
import com.app.eshop.entity.Allocation;
import com.app.eshop.entity.Exercises;
import com.app.eshop.entity.Grant;
import com.app.eshop.entity.Plan;
import com.app.eshop.repository.AllocationRepository;
import com.app.eshop.repository.ExerciseRepository;

@Service
public class AllocationService {
	@Autowired
	private PlanService planService;
	@Autowired
	private GrantService grantService;
	@Autowired
	private AllocationRepository allocationRerpository;
	
	@Autowired
	private ExerciseRepository exercisRepo;

	@Scheduled(cron = "3 * * ? * *")
	public void init() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// System.out.println("hello");
				prepareAndProcessAllocation();
			}
		}).start();
	}

	public void prepareAndProcessAllocation() {
		Plan plan = planService.getCurrentPlan();
		System.out.println(plan);
		if (plan != null) {
			Optional<List<Grant>> grants = grantService.getGrantsForAllocationById(plan.getId());
			System.out.println(grants.get());
			List<Allocation> allocations = new ArrayList<>();
			if (grants.isPresent()) {
				for (Grant grant : grants.get()) {
					if (grant.getAllocation().equals("open") && grant.getGrantStatus().equals("approve")) {
						prepareAllocation(grant, allocations);
						
					}
				}
			}
			if(!allocations.isEmpty()) {
			allocationRerpository.saveAll(allocations);
			}
		}
	}

	public void prepareAllocation(Grant grant, List<Allocation> allocations) {

		Double numberofAllocation = grant.getNumberOfGrant() * 1.0 / grant.getFrequency();
		Long frequency = null;
	
		if ( grant.getFrequency() > 0 && grant.getFrequency() < 6) {
			frequency = grant.getFrequency();
		}
		else if(grant.getBand() >= 6){
			frequency = 5l;
		}
//		else {
//			Allocation allocation = new Allocation();
//			allocation.setAllocationStatus("nextYear");
//			allocation.setGrantId(grant.getId());
//			allocation.setNumberOfAllocation(numberofAllocation);
//			
//			allocation.setPlannedAllocationDate(LocalDate.now());
//			allocation.setAllocationYear(null);
//			allocations.add(allocation);
//		}
		if(frequency != null) {
			LocalDate date = LocalDate.now();
			grantService.updateGrant(grant);
			Long year = LocalDate.now().getYear() + grant.getFrequency();
			for (int i = 0; i < frequency; i++) {
				Allocation allocation = new Allocation();
				allocation.setAllocationStatus("pending");
				allocation.setGrantId(grant.getId());
				allocation.setNumberOfAllocation(numberofAllocation);
				date = date.plusYears(1);
				allocation.setPlannedAllocationDate(date);
				allocation.setAllocationYear(year);
				allocations.add(allocation);
				
			}
			
		}
		
	}
	public void approveAllocation(List<Long> allocationIdList) {
		allocationIdList.forEach(e -> {
			Allocation allocation = allocationRerpository.findById(e).get();
			allocation.setActualAllocationDate(LocalDate.now());
			allocation.setAllocationStatus("approve");
			allocationRerpository.save(allocation);         
		});
	}
	
	@Autowired
	private JdbcService jdbcService;
	
	private Double sum;
	public Object monetization(VsetingDto dto) {
		System.out.println(dto);
		Map<Object,Object> ol = new LinkedHashMap<>();
		Plan plan = planService.getPlanById(dto.getPlanId());
		if(plan != null) {
			ol.put("PlanId", plan.getId());
			plan.setVestingFactor(dto.getVestingFactor());
			plan.setVestedDate(LocalDate.now().toString());
			planService.updatePlan(plan);
			List<Output> grantData = jdbcService.getGrantAndSumOfAllocatio(plan.getId());		
				grantData.forEach(grant -> {
					ol.put("grant", grant.toString());		
					List<Grant> grants = grantService.getGrantsForAllocationById(plan.getId()).get();
					System.out.println(grants);
					grants.forEach(g->{
						sum=0.0;
						if(g.getAllocation().equals("allocated")) {
						List<Allocation> allocations = getAllocationListByGrantId(g.getId()).get();
						allocations.forEach(allocation -> {
							
							if(allocation.getAllocationStatus().equals("approve")) {
								
								sum = sum+ allocation.getNumberOfAllocation();
							
							}
						});
						if(sum!=0) {
							Exercises exercises = new Exercises();
							
							exercises.setGrantId(g.getId());
							exercises.setVestedOption(sum*dto.getVestingFactor());
							exercisRepo.save(exercises);
						}
						}
					});	
			});
				ol.put("grant",grantData);
		}
		
		return ol;
	}
	
	
	public Optional<List<Allocation>> getAllocationListByGrantId(Long grantId){
		return  allocationRerpository.findByGrantId(grantId);
	}
}