package com.app.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eshop.entity.Plan;
@Repository
public interface PlanRepository extends JpaRepository<Plan,Long> {
	Plan findByIsCurrentPlan(Boolean isCurrentPlan);
}
