package com.app.demo.dto;

import java.util.Date;

public class OrderedProducts {
	private CustomerOrder customerOrders;
	private Date opDate;
	private Integer orderedProductsId;
	private Integer productsId;
	private Integer quantity;
	private String status;
	public CustomerOrder getCustomerOrders() {
		return customerOrders;
	}
	public void setCustomerOrders(CustomerOrder customerOrders) {
		this.customerOrders = customerOrders;
	}
	public Date getOpDate() {
		return opDate;
	}
	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}
	public Integer getOrderedProductsId() {
		return orderedProductsId;
	}
	public void setOrderedProductsId(Integer orderedProductsId) {
		this.orderedProductsId = orderedProductsId;
	}
	public Integer getProductsId() {
		return productsId;
	}
	public void setProductsId(Integer productsId) {
		this.productsId = productsId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderedProducts [customerOrdersId=" + customerOrders + ", opDate=" + opDate + ", orderedProductsId="
				+ orderedProductsId + ", productsId=" + productsId + ", quantity=" + quantity + ", status=" + status
				+ "]";
	}
	
}
