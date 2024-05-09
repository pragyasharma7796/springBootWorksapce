package com.app.demo.dto;

import java.util.Date;

public class CustomerOrder {
	private Customer customer;
	private CustomerOrder customerOrder;
	private Date date1;
	private Delivery delivery;
	private Seller seller;
	private String status;
	private WareHouse warehouse;
	public Customer getCustomereId() {
		return customer;
	}
	public void setCustomere(Customer customer) {
		this.customer = customer;
	}
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDeliveryId(Delivery delivery) {
		this.delivery = delivery;
	}
	public Seller getSellerId() {
		return seller;
	}
	public void setSellerId(Seller seller) {
		this.seller = seller;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public WareHouse getWarehouseId() {
		return warehouse;
	}
	public void setWarehouseId(WareHouse warehouse) {
		this.warehouse = warehouse;
	}
	@Override
	public String toString() {
		return "CustomerOrder [customereId=" + customer + ", customerOrderId=" + customerOrder + ", date1=" + date1
				+ ", deliveryId=" + delivery + ", sellerId=" + seller + ", status=" + status + ", warehouseId="
				+ warehouse + "]";
	}
	
}
