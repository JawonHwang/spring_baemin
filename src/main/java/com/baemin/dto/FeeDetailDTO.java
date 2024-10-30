package com.baemin.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class FeeDetailDTO {
	private Long feeDetailId;

	private LocalDate Ddate;
	
	private String content;
	
	private Long income;
	
	private Long expend;

	private Long totalMoney;
	
	private LocalDate creDate;
	
	private String creAdmin;
	
	private LocalDate uptDate;
	
	private String uptAdmin;

	public FeeDetailDTO() {
		super();
	}

	public FeeDetailDTO(Long feeDetailId, LocalDate ddate, String content, Long income, Long expend, Long totalMoney,
			LocalDate creDate, String creAdmin, LocalDate uptDate, String uptAdmin) {
		super();
		this.feeDetailId = feeDetailId;
		Ddate = ddate;
		this.content = content;
		this.income = income;
		this.expend = expend;
		this.totalMoney = totalMoney;
		this.creDate = creDate;
		this.creAdmin = creAdmin;
		this.uptDate = uptDate;
		this.uptAdmin = uptAdmin;
	}

	public Long getFeeDetailId() {
		return feeDetailId;
	}

	public void setFeeDetailId(Long feeDetailId) {
		this.feeDetailId = feeDetailId;
	}

	public LocalDate getDdate() {
		return Ddate;
	}

	public void setDdate(LocalDate ddate) {
		Ddate = ddate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public Long getExpend() {
		return expend;
	}

	public void setExpend(Long expend) {
		this.expend = expend;
	}

	public Long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Long totalMoney) {
		this.totalMoney = totalMoney;
	}

	public LocalDate getCreDate() {
		return creDate;
	}

	public void setCreDate(LocalDate creDate) {
		this.creDate = creDate;
	}

	public String getCreAdmin() {
		return creAdmin;
	}

	public void setCreAdmin(String creAdmin) {
		this.creAdmin = creAdmin;
	}

	public LocalDate getUptDate() {
		return uptDate;
	}

	public void setUptDate(LocalDate uptDate) {
		this.uptDate = uptDate;
	}

	public String getUptAdmin() {
		return uptAdmin;
	}

	public void setUptAdmin(String uptAdmin) {
		this.uptAdmin = uptAdmin;
	}
	
}
