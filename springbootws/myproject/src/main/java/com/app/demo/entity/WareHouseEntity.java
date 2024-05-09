package com.app.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="warehouse")
public class WareHouseEntity {
	@Id
	@GeneratedValue
	private Integer wareHouseId;
	private String wareHauseName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="locationId")
	private LocationEntity location;
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
	public LocationEntity getLocation() {
		return location;
	}
	public void setLocationId(LocationEntity location) {
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
		return "WareHouseEntity [wareHouseId=" + wareHouseId + ", wareHauseName=" + wareHauseName + ", locationId="
				+ location + ", phone=" + phone + ", email=" + email + ", pwd=" + pwd + ", address=" + address + "]";
	}
	
}
