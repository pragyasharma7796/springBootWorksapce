package com.app.demo.controller;

import lombok.Data;

//@Data
public class Car {
       private int id;
       private String brand;
       private String name;
	public Car(int id, String brand, String name) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
	}
	public Car() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", name=" + name + "]";
	}
       
}
