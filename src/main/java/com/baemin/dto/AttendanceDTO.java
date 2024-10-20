package com.baemin.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class AttendanceDTO {
	
	private Long attId;			//출석ID
	private MemberDTO member;		//회원ID
	private String attState;	//출석상태
	private LocalDate attAt;	//출석날짜
	private Timestamp creAt;	//생성일
	private Timestamp uptAt;	//수정일
	
	public AttendanceDTO() {
		super();
	}

	public AttendanceDTO(Long attId, MemberDTO member, String attState, LocalDate attAt, Timestamp creAt,
			Timestamp uptAt) {
		super();
		this.attId = attId;
		this.member = member;
		this.attState = attState;
		this.attAt = attAt;
		this.creAt = creAt;
		this.uptAt = uptAt;
	}

	public Long getAttId() {
		return attId;
	}

	public void setAttId(Long attId) {
		this.attId = attId;
	}

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}

	public String getAttState() {
		return attState;
	}

	public void setAttState(String attState) {
		this.attState = attState;
	}

	public LocalDate getAttAt() {
		return attAt;
	}

	public void setAttAt(LocalDate attAt) {
		this.attAt = attAt;
	}

	public Timestamp getCreAt() {
		return creAt;
	}

	public void setCreAt(Timestamp creAt) {
		this.creAt = creAt;
	}

	public Timestamp getUptAt() {
		return uptAt;
	}

	public void setUptAt(Timestamp uptAt) {
		this.uptAt = uptAt;
	}
}
