package com.jspider.carewale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.carewale.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
