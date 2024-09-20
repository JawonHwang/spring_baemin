package com.baemin.dto;

public class PayMethodDTO {
	private Long payMthId;
	private String payMthName;
	public Long getPayMthId() {
		return payMthId;
	}
	public void setPayMthId(Long payMthId) {
		this.payMthId = payMthId;
	}
	public String getPayMthName() {
		return payMthName;
	}
	public void setPayMthName(String payMthName) {
		this.payMthName = payMthName;
	}
	public PayMethodDTO(Long payMthId, String payMthName) {
		super();
		this.payMthId = payMthId;
		this.payMthName = payMthName;
	}
	public PayMethodDTO() {
		super();
	}
}
