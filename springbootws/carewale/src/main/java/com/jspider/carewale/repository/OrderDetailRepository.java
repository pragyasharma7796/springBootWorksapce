package com.jspider.carewale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.carewale.entity.OrderDetails;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,Long> {

}
