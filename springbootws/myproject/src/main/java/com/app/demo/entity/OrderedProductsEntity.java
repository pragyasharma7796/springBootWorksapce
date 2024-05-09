package com.app.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ordered_products")
public class OrderedProductsEntity {
	@ManyToOne
	@JoinColumn(name="customerOrdersId")
	private CustomerOrderEntity customerOrders;
	private Date opDate;
	
	@Id
	@GeneratedValue
	private Integer orderedProductsId;
	
	@OneToOne
	@JoinColumn(name="productsId")
	private ProductEntity products;
	private Integer quantity;
	private String status;
	public CustomerOrderEntity getCustomerOrdersId() {
		return customerOrders;
	}
	public void setCustomerOrdersId(CustomerOrderEntity customerOrders) {
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
	public ProductEntity getProductsId() {
		return products;
	}
	public void setProductsId(ProductEntity products) {
		this.products = products;
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
				+ orderedProductsId + ", productsId=" + products + ", quantity=" + quantity + ", status=" + status
				+ "]";
	}
	
}
