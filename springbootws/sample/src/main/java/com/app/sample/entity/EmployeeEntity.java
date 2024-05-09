package com.app.sample.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.sample.constant.AppConstant;

@Entity
@Table(name = AppConstant.EMPLOYEE_INFO )
public class EmployeeEntity {
	
	@Id
	@GeneratedValue
	@Column(name = AppConstant.EMPLOYEE_ID)
	private Long id; 
	
	@Column(name = AppConstant.EMPLOYEE_NAME)
	private String name;
	
	@Column(name = AppConstant.EMPLOYEE_EMAIL)
	private String email;
	
	@Column(name = AppConstant.EMPLOYEE_DATE_OF_BIRTH)
	private Date dob;
	
	@Column(name = AppConstant.EMPLOYEE_AGE)
	private Long age; 
	
	@Column(name = AppConstant.EMPLOYEE_SALARY)
	private Double salary;
	
	@Column(name = AppConstant.EMPLOYEE_STATUS)
	private String status; //(ACTIVE/ INACTIVE) - (BOOLEAN)
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "employeeEntity [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age
				+ ", salary=" + salary + ", status=" + status + "]";
	}
	
}
