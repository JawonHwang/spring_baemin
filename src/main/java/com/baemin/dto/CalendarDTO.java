package com.baemin.dto;

import java.sql.Timestamp;

public class CalendarDTO {

	private Long calId;
	private String calMemId;
	private String calTitle;
	private String calContents;
	private Timestamp calStartTime;
	private Timestamp calEndTime;
	private Timestamp calWriteDate;
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

	public CalendarDTO(Long calId, String calMemId, String calTitle, String calContents, Timestamp calStartTime,
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

	public CalendarDTO() {
		super();
	}

}
