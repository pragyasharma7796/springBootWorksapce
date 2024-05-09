package com.app.eshop.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.eshop.constant.AppConstant;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name = AppConstant.PLAN_TABLE_NAME)
public class Plan implements Serializable {
		@Id
		@GeneratedValue
		private Long id;
		private String planYear;
		private String planStartDate;
		private String planEndDate;
		private Boolean isCurrentPlan;
		private Double vestingFactor;
		private String vestedDate;
}