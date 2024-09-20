package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAY_METHODS")
public class PayMethod {
	@Id
	@Column(name = "PAY_MTH_ID")
	private Long payMthId;

	@Column(name = "PAY_MTH_NAME")
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

	public PayMethod(Long payMthId, String payMthName) {
		super();
		this.payMthId = payMthId;
		this.payMthName = payMthName;
	}

	public PayMethod() {
		super();
	}
}
