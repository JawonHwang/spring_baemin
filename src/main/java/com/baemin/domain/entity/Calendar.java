package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CALENDARS")
public class Calendar {

	@Id
	@Column(name = "CAL_ID")
	private Long calId;

	@Column(name = "CAL_MEM_ID")
	private String calMemId;
	
	@Column(name = "CAL_TITLE")
	private String calTitle;
	
	@Column(name = "CAL_CONTENTS")
	private String calContents;
	
	@Column(name = "CAL_START_TIME")
	private Timestamp calStartTime;
	
	@Column(name = "CAL_END_TIME")
	private Timestamp calEndTime;
	
	@Column(name = "CAL_WRITE_DATE")
	private Timestamp calWriteDate;
	
	@Column(name = "CAL_TYPE_ID")
	private Long calTypeId;

	public Long getCalId() {
		return calId;
	}

	public void setCalId(Long calId) {
		this.calId = calId;
	}

	public String getCalMemId() {
		return calMemId;
	}

	public void setCalMemId(String calMemId) {
		this.calMemId = calMemId;
	}

	public String getCalTitle() {
		return calTitle;
	}

	public void setCalTitle(String calTitle) {
		this.calTitle = calTitle;
	}

	public String getCalContents() {
		return calContents;
	}

	public void setCalContents(String calContents) {
		this.calContents = calContents;
	}

	public Timestamp getCalStartTime() {
		return calStartTime;
	}

	public void setCalStartTime(Timestamp calStartTime) {
		this.calStartTime = calStartTime;
	}

	public Timestamp getCalEndTime() {
		return calEndTime;
	}

	public void setCalEndTime(Timestamp calEndTime) {
		this.calEndTime = calEndTime;
	}

	public Timestamp getCalWriteDate() {
		return calWriteDate;
	}

	public void setCalWriteDate(Timestamp calWriteDate) {
		this.calWriteDate = calWriteDate;
	}

	public Long getCalTypeId() {
		return calTypeId;
	}

	public void setCalTypeId(Long calTypeId) {
		this.calTypeId = calTypeId;
	}

	public Calendar(Long calId, String calMemId, String calTitle, String calContents, Timestamp calStartTime,
			Timestamp calEndTime, Timestamp calWriteDate, Long calTypeId) {
		super();
		this.calId = calId;
		this.calMemId = calMemId;
		this.calTitle = calTitle;
		this.calContents = calContents;
		this.calStartTime = calStartTime;
		this.calEndTime = calEndTime;
		this.calWriteDate = calWriteDate;
		this.calTypeId = calTypeId;
	}

	public Calendar() {
		super();
	}
	
}
