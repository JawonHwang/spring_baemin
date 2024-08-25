package com.baemin.dto;

import java.sql.Timestamp;

public class AttendanceDTO {
	
	private Long attId;			//출석ID
	private String memId;		//회원ID
	private Boolean isAtt;		//출석여부
	private Timestamp attAt;	//출석날짜
	private Timestamp creAt;	//생성일
	private Timestamp uptAt;	//수정일
	
	public AttendanceDTO() {
		super();
	}

	public AttendanceDTO(Long attId, String memId, Boolean isAtt, Timestamp attAt, Timestamp creAt, Timestamp uptAt) {
		super();
		this.attId = attId;
		this.memId = memId;
		this.isAtt = isAtt;
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

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public Boolean getIsAtt() {
		return isAtt;
	}

	public void setIsAtt(Boolean isAtt) {
		this.isAtt = isAtt;
	}

	public Timestamp getAttAt() {
		return attAt;
	}

	public void setAttAt(Timestamp attAt) {
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
