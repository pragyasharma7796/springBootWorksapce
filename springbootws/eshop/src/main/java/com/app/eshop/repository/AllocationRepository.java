package com.app.eshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.eshop.entity.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation,Long>{
	Optional<List<Allocation>> findByGrantId(Long grantId);
	
	
}