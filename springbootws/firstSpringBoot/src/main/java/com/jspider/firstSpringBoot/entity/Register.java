package com.jspider.firstSpringBoot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jspider.firstSpringBoot.constant.AppConstant;

import lombok.Data;

@Entity
@Table(name=AppConstant.REGISTER_INFO)
public class Register implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	@Column(name="contact_no")
	private String contactNo;
	private String city;
	private String country;
	private String pincode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", city="
				+ city + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
}
