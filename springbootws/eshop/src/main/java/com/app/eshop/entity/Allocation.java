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
@Table(name=AppConstant.ALLOCATION_TABLE)
public class Allocation implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private Long grantId;
	private Double numberOfAllocation;
	private LocalDate plannedAllocationDate;
	private LocalDate actualAllocationDate;
	private Long allocationYear;
	private String allocationStatus;
}
