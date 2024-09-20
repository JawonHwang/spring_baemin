package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MEMBER_SHIP_FEES")
public class MemberShipFee {
	@Id
	@Column(name = "FEE_ID")
	private Long feeId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEM_ID")
	private Member member;
	
	@Column(name = "MONTHLY_FEE")
	private Long monthlyFee;
	
	@Column(name = "AMOUNT")
	private Long amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAY_MTH_ID")
	private PayMethod payMethod;

	@Column(name = "IS_FEE")
	private boolean isFee;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "PAY_AT")
	private Timestamp payAt;
	
	@Column(name = "CRE_AT")
	private Timestamp creAt;
	
	@Column(name = "FEE_DTAIL_ID")
	private Long feeDtailId;

	public MemberShipFee() {
		super();
	}

	public MemberShipFee(Long feeId, Member member, Long monthlyFee, Long amount, PayMethod payMethod, boolean isFee,
			String remarks, Timestamp payAt, Timestamp creAt, Long feeDtailId) {
		super();
		this.feeId = feeId;
		this.member = member;
		this.monthlyFee = monthlyFee;
		this.amount = amount;
		this.payMethod = payMethod;
		this.isFee = isFee;
		this.remarks = remarks;
		this.payAt = payAt;
		this.creAt = creAt;
		this.feeDtailId = feeDtailId;
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

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public PayMethod getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}

	public boolean isFee() {
		return isFee;
	}

	public void setFee(boolean isFee) {
		this.isFee = isFee;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getPayAt() {
		return payAt;
	}

	public void setPayAt(Timestamp payAt) {
		this.payAt = payAt;
	}

	public Timestamp getCreAt() {
		return creAt;
	}

	public void setCreAt(Timestamp creAt) {
		this.creAt = creAt;
	}

	public Long getFeeDtailId() {
		return feeDtailId;
	}

	public void setFeeDtailId(Long feeDtailId) {
		this.feeDtailId = feeDtailId;
	}
	
	
}
