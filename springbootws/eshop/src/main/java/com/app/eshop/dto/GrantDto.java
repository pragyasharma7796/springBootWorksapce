package com.app.eshop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class GrantDto {
	private String employeeNumber;
	private Long numberOfGrant;
	private Long band;
	private Double grantPrice;
	private String lockInStatus;
	private Long frequency;
	private  Long vestingTenure;
	private Long planId;
}