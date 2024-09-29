package com.baemin.domain.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MEMBER_SHIP_FEES")
public class MemberShipFee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FEE_ID")
	private Long feeId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEM_ID")
	private Member member;

	@Column(name = "MONTHLY_FEE")
	private Long monthlyFee;

	@Column(name = "AMOUNT")
	private int amount;
	
	@Column(name = "PAY_METHOD")
	private String payMethod;

	@Column(name = "IS_PAID")
	private String isPaid;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "PAY_DATE")
	private LocalDate payDate;

	@Column(name = "CRE_AT")
	private LocalDateTime creAt;

	@Column(name = "UPT_AT")
	private LocalDateTime uptAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADMIN_ID")
	private Admin admin;

	public MemberShipFee() {
		super();
	}

	public MemberShipFee(Long feeId, Member member, Long monthlyFee, int amount, String payMethod, String isPaid,
			String remarks, LocalDate payDate, LocalDateTime creAt, LocalDateTime uptAt, Admin admin) {
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

	public Long getFeeId() {
		return feeId;
	}

	public void setFeeId(Long feeId) {
		this.feeId = feeId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
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

	public String getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}

	public void setUptAt(LocalDateTime uptAt) {
		this.uptAt = uptAt;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
