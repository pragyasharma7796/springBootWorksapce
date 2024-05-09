package com.app.eshop.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class VsetingDto implements Serializable {
	private Double vestingFactor;
	private Long planId;
}
