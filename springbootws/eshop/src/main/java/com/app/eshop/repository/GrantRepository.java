package com.app.eshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eshop.entity.Grant;

@Repository
public interface GrantRepository extends JpaRepository<Grant, Long> {
	Optional< List<Grant>> findByPlanId(Long planId);
}
