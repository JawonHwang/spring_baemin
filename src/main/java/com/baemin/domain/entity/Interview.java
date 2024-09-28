package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "INTERVIEW")
public class Interview {

	@Id
	@Column(name = "IV_ID")
	private int ivId;

	@Column(name = "IV_DATE")
	private String ivDate;

	public int getIvId() {
		return ivId;
	}

	public void setIvId(int ivId) {
		this.ivId = ivId;
	}

	public String getIvDate() {
		return ivDate;
	}

	public void setIvDate(String ivDate) {
		this.ivDate = ivDate;
	}

	public Interview(int ivId, String ivDate) {
		super();
		this.ivId = ivId;
		this.ivDate = ivDate;
	}

	public Interview() {
		super();
	}

}
