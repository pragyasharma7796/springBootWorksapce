package com.app.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eshop.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
