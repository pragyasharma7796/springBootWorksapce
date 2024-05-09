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
@Table(name=AppConstant.ALLOCATION_ACTIVITY_TABLE)

public class ExersciseActivity implements Serializable {
		@Id
		@GeneratedValue
		private Long id;
		private Long grantId;
		private String employeeId;
		private Double soldOption;
		private String status;
		private String createdDate;
}
