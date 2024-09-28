package com.baemin.dto;

import java.sql.Timestamp;

public class ClubNumDTO {
	private Long clubNumId;
	private String startYear;
	private String semester;
	private Long clubNum;
	private Timestamp creAt;
	
	public ClubNumDTO() {
		super();
	}

	public ClubNumDTO(Long clubNumId, String startYear, String semester, Long clubNum, Timestamp creAt) {
		super();
		this.clubNumId = clubNumId;
		this.startYear = startYear;
		this.semester = semester;
		this.clubNum = clubNum;
		this.creAt = creAt;
	}

	public Long getClubNumId() {
		return clubNumId;
	}

	public void setClubNumId(Long clubNumId) {
		this.clubNumId = clubNumId;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Long getClubNum() {
		return clubNum;
	}

	public void setClubNum(Long clubNum) {
		this.clubNum = clubNum;
	}

	public Timestamp getCreAt() {
		return creAt;
	}

	public void setCreAt(Timestamp creAt) {
		this.creAt = creAt;
	}
}
