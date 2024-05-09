package com.app.eshop.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.eshop.constant.AppConstant;

import lombok.Data;

@Entity
@Data
@Table (name = AppConstant.GRANT_TABLE_NAME)
public class Grant implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String employeeNumber;
	private Long numberOfGrant;
	private Long band;
	private Double grantPrice;
	private String grantStatus;
	private Boolean isAccepted;
	private LocalDate acceptedDate;
	private String lockInStatus;
	private Long frequency;
	private  Long vestingTenure;
	private String allocation;
	private Long planId;
}
