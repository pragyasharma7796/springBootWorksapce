package com.jspider.carewale.dto;

public class BookDto {
	private Long bradId;
	private String paymentMode;
	private Double advancePaid;
	public Long getBradId() {
		return bradId;
	}
	public void setBradId(Long bradId) {
		this.bradId = bradId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Double getAdvancePaid() {
		return advancePaid;
	}
	public void setAdvancePaid(Double advancePaid) {
		this.advancePaid = advancePaid;
	}
	
}
