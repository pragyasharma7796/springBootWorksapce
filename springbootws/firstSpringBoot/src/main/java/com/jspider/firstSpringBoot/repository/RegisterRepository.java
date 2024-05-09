package com.jspider.firstSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.firstSpringBoot.entity.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

}
