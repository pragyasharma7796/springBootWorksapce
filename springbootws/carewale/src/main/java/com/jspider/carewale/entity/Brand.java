package com.jspider.carewale.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jspider.carewale.constant.AppConstant;

@Entity
@Table(name = AppConstant.BRAND_INFO)
public class Brand implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@Column(name="established_year")
	private String establishedYear;
	
	@Column(name = "head_quaters")
	private String headQuaters;
	
	@Column(name = "ceo_name")
	private String ceoName;
	
	@Column(name = "brand_value")
	private String brandValue;
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
	public String getEstablishedYear() {
		return establishedYear;
	}
	public void setEstablishedYear(String establishedYear) {
		this.establishedYear = establishedYear;
	}
	public String getHeadQuaters() {
		return headQuaters;
	}
	public void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getBrandValue() {
		return brandValue;
	}
	public void setBrandValue(String brandValue) {
		this.brandValue = brandValue;
	}
	@Override
	public String toString() {
		return "brand [id=" + id + ", name=" + name + ", establishedYear=" + establishedYear + ", headQuaters="
				+ headQuaters + ", ceoName=" + ceoName + ", brandValue=" + brandValue + "]";
	}
	
}
