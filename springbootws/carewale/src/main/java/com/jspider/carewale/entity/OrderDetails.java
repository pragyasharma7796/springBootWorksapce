package com.jspider.carewale.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jspider.carewale.constant.AppConstant;

import lombok.Data;

@Data
@Entity
@Table(name = AppConstant.ORDER_DETAILS_INFO)
public class OrderDetails implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "brand_id")
	private Long brandId;
	
	@Column(name = "payment_mode")
	private String paymentMode;
	
	@Column(name = "order_date")
	private Date orderdDate;
	
	@Column(name = "deliver_date")
	private Date deliveredDate;
	
	@Column(name = "is_delivered")
	private Boolean isDelivered;
	
	@Column(name = "advance_paid")
	private Double advancePaid;
	
	@Column(name = "tatal_amount_received")
	private Double totalAmountReceived;
}
