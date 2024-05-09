package com.app.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")
public class DeliveryEntity {
	
	private String name;
	private String email;
	private String phone;
	private String password;
	private String address;
	
	@Id
	@GeneratedValue
	private Integer deliveryId;
	
	@ManyToOne
	@JoinColumn(name="wareHouseId")
	private WareHouseEntity wareHouse;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public WareHouseEntity getWareHouseId() {
		return wareHouse;
	}
	public void setWareHouseId(WareHouseEntity wareHouse) {
		this.wareHouse = wareHouse;
	}
	@Override
	public String toString() {
		return "Delivery [name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", address=" + address + ", deliveryId=" + deliveryId + ", wareHouseId=" + wareHouse + "]";
	}
	
}
