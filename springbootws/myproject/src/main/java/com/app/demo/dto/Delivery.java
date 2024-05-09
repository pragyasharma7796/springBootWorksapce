package com.app.demo.dto;

public class Delivery {
	private String name;
	private String email;
	private String phone;
	private String password;
	private String address;
	private Integer deliveryId;
	
	private WareHouse wareHouse;
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
	public WareHouse getWareHouse() {
		return wareHouse;
	}
	public void setWareHouseId(WareHouse wareHouse) {
		this.wareHouse = wareHouse;
	}
	@Override
	public String toString() {
		return "Delivery [name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", address=" + address + ", deliveryId=" + deliveryId + ", wareHouseId=" + wareHouse + "]";
	}
	
}
