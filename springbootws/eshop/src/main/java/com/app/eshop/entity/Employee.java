package com.app.eshop.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.eshop.constant.AppConstant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name=AppConstant.EMPLOYEE_TABLE_NAME)
public class Employee implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="employee_number")
	private String employeeNumber;
	private String band;
	private String designation;
	@Column(name = "employee_start")
	private Date employeeStart;
	private Boolean isActive;
	
}
