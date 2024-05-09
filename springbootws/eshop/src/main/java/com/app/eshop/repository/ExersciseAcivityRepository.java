package com.app.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eshop.entity.ExersciseActivity;

@Repository
public interface ExersciseAcivityRepository extends JpaRepository<ExersciseActivity, Long> {

}
