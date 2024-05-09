package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="emp")
public class EmployeeEntity {

@Id	
private Integer empid;
private String name;
private String city;
private Double salary;


public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
}
}
