package com.app.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eshop.entity.Exercises;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercises, Long> {
	Exercises findByGrantId(Long grantId);
}
