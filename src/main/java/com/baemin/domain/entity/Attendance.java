package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ATTENDANCES")
public class Attendance {

	@Id
	@Column(name="ATT_ID")		//출석ID
	private Integer attId;

	@Column(name="MEM_ID")		//회원ID
	private String memId;

	@Column(name="IS_ATT")		//출석여부
	private Boolean isAtt;

	@Column(name="ATT_AT")		//출석날짜
	private Timestamp attAt;

	@Column(name="CRE_AT")		//생성일
	private Timestamp creAt;

	@Column(name="UPT_AT")		//수정일
	private Timestamp uptAt;

	public Attendance() {
		super();
	}

	public Attendance(int attId, String memId, Boolean isAtt, Timestamp attAt, Timestamp creAt, Timestamp uptAt) {
		super();
		this.attId = attId;
		this.memId = memId;
		this.isAtt = isAtt;
		this.attAt = attAt;
		this.creAt = creAt;
		this.uptAt = uptAt;
	}

	public int getAttId() {
		return attId;
	}

	public void setAttId(int attId) {
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
