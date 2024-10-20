package com.baemin.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FEE_DETAILS")
public class FeeDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FEE_DETAIL_ID")
	private Long feeDetailId;

	@Column(name = "D_DATE")
	private LocalDate Ddate;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "INCOME")
	private Long income;
	
	@Column(name = "EXPEND")
	private Long expend;

	@Column(name = "TOTAL_MONEY")
	private Long totalMoney;
	
	@Column(name = "CRE_DATE")
	private LocalDate creDate;
	
	@Column(name = "CRE_ADMIN")
	private String creAdmin;
	
	@Column(name = "UPT_DATE")
	private LocalDate uptDate;
	
	@Column(name = "UPT_ADMIN")
	private String uptAdmin;

	public FeeDetail() {
		super();
	}

	public FeeDetail(Long feeDetailId, LocalDate ddate, String content, Long income, Long expend, Long totalMoney,
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
