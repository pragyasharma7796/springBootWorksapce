package com.app.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class CustomerOrderEntity {
	@ManyToOne
	@JoinColumn(name="customereId")
	private CustomerEntity customer;
	
	@Id
	@GeneratedValue
	private Integer customerOrderId;
	private Date date1;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="deliveryId")
	private DeliveryEntity delivery;
	
	@ManyToOne
	@JoinColumn
	private SellerEntity seller;
	
	private String status;
	private Integer warehouseId;
	public CustomerEntity getCustomereId() {
		return customer;
	}
	public void setCustomereId(CustomerEntity customer) {
		this.customer = customer;
	}
	public Integer getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(Integer customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public DeliveryEntity getDeliveryId() {
		return delivery;
	}
	public void setDelivery(DeliveryEntity delivery) {
		this.delivery = delivery;
	}
	public SellerEntity getSellerId() {
		return seller;
	}
	public void setSellerId(SellerEntity seller) {
		this.seller = seller;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}
	@Override
	public String toString() {
		return "CustomerOrder [customereId=" + customer + ", customerOrderId=" + customerOrderId + ", date1=" + date1
				+ ", deliveryId=" + delivery + ", sellerId=" + seller + ", status=" + status + ", warehouseId="
				+ warehouseId + "]";
	}
	
}
