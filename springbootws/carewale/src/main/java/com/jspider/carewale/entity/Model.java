package com.jspider.carewale.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jspider.carewale.constant.AppConstant;

@Entity
@Table(name = AppConstant.MODEL_INFO)
public class Model implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="model_name")
	private String modelName;
	
	@Column(name = "brand_id")
	private Long brandId;
	private Double price;
	private String type;
	private String color;
	private String version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", modelName=" + modelName + ", brandId=" + brandId + ", price=" + price + ", type="
				+ type + ", color=" + color + ", version=" + version + "]";
	}
	
	
}
