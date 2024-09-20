package com.baemin.dto;

import java.sql.Timestamp;

import com.baemin.domain.entity.Member;
import com.baemin.domain.entity.PayMethod;

public class MemberShipFeeDTO {
	private Long feeId;
	private Member member;
	private Long monthlyFee;
	private Long amount;
	private PayMethod payMethod;
	private boolean isFee;
	private String remarks;
	private Timestamp payAt;
	private Timestamp creAt;
	private Long feeDtailId;
	
	public MemberShipFeeDTO() {
		super();
	}

	public MemberShipFeeDTO(Long feeId, Member member, Long monthlyFee, Long amount, PayMethod payMethod, boolean isFee,
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
