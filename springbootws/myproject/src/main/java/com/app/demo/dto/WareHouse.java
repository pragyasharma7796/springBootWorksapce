package com.app.demo.dto;

public class WareHouse {
	private Integer wareHouseId;
	private String wareHauseName;
	private Location location;
	private String phone;
	private String email;
	private String pwd;
	private String address;
	public Integer getWareHouseId() {
		return wareHouseId;
	}
	public void setWareHouseId(Integer wareHouseId) {
		this.wareHouseId = wareHouseId;
	}
	public String getWareHauseName() {
		return wareHauseName;
	}
	public void setWareHauseName(String wareHauseName) {
		this.wareHauseName = wareHauseName;
	}
	public Location getLocationId() {
		return location;
	}
	public void setLocationId(Location location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "WareHouse [wareHouseId=" + wareHouseId + ", wareHauseName=" + wareHauseName + ", locationId="
				+ location + ", phone=" + phone + ", email=" + email + ", pwd=" + pwd + ", address=" + address + "]";
	}
	
}
