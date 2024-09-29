package com.baemin.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class ClubNumDTO {
	private Long clubNumId;
	private int startYear;
	private int semester;
	private int clubNum;
	private LocalDate creAt;
	
	public ClubNumDTO() {
		super();
	}

	public ClubNumDTO(Long clubNumId, int startYear, int semester, int clubNum, LocalDate creAt) {
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

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getClubNum() {
		return clubNum;
	}

	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}

	public LocalDate getCreAt() {
		return creAt;
	}

	public void setCreAt(LocalDate creAt) {
		this.creAt = creAt;
	}
}
