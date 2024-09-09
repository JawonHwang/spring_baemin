package com.baemin.dto;

public class CalendarTypeDTO {

	private Long calTypeId;
	private String calType;

	public Long getCalTypeId() {
		return calTypeId;
	}

	public void setCalTypeId(Long calTypeId) {
		this.calTypeId = calTypeId;
	}

	public String getCalType() {
		return calType;
	}

	public void setCalType(String calType) {
		this.calType = calType;
	}

	public CalendarTypeDTO(Long calTypeId, String calType) {
		super();
		this.calTypeId = calTypeId;
		this.calType = calType;
	}

	public CalendarTypeDTO() {
		super();
	}

}
