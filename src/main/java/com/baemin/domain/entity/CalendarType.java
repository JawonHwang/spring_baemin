package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CALENDAR_TYPES")
public class CalendarType {

	@Id
	@Column(name = "CAL_TYPE_ID")
	private Long calTypeId;

	@Column(name = "CAL_TYPE")
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

	public CalendarType(Long calTypeId, String calType) {
		super();
		this.calTypeId = calTypeId;
		this.calType = calType;
	}

	public CalendarType() {
		super();
	}

}
