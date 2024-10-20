package com.baemin.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MemberShipFeeDTO {
	private Long feeId;
	private MemberDTO member;
	private Long monthlyFee;
	private int amount;
	private String payMethod;
	private String isPaid;
	private String remarks;
	private LocalDate payDate;
	private LocalDateTime creAt;
	private LocalDateTime uptAt;
	private AdminDTO admin;
	
	public MemberShipFeeDTO() {
		super();
	}

	public MemberShipFeeDTO(Long feeId, MemberDTO member, Long monthlyFee, int amount, String payMethod,
			String isPaid, String remarks, LocalDate payDate, LocalDateTime creAt, LocalDateTime uptAt, AdminDTO admin) {
		super();
		this.feeId = feeId;
		this.member = member;
		this.monthlyFee = monthlyFee;
		this.amount = amount;
		this.payMethod = payMethod;
		this.isPaid = isPaid;
		this.remarks = remarks;
		this.payDate = payDate;
		this.creAt = creAt;
		this.uptAt = uptAt;
		this.admin = admin;
	}

	public String getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}

	public Long getFeeId() {
		return feeId;
	}

	public void setFeeId(Long feeId) {
		this.feeId = feeId;
	}

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

	public Long getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(Long monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String isPaid() {
		return isPaid;
	}

	public void setPaid(String isPaid) {
		this.isPaid = isPaid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDate getPayDate() {
		return payDate;
	}

	public void setPayDate(LocalDate payDate) {
		this.payDate = payDate;
	}

	public LocalDateTime getCreAt() {
		return creAt;
	}

	public void setCreAt(LocalDateTime creAt) {
		this.creAt = creAt;
	}

	public LocalDateTime getUptAt() {
		return uptAt;
	}

	public void setUptAt(LocalDateTime uptAt) {
		this.uptAt = uptAt;
	}

	public AdminDTO getAdmin() {
		return admin;
	}

}
