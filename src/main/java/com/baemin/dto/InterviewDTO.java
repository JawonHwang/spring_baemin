package com.baemin.dto;

public class InterviewDTO {

	private int ivId;
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

	public InterviewDTO(int ivId, String ivDate) {
		super();
		this.ivId = ivId;
		this.ivDate = ivDate;
	}

	public InterviewDTO() {
		super();
	}

}
