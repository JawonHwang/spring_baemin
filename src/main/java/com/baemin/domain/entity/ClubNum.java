package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLUB_NUM")
public class ClubNum {
	@Id
	@Column(name = "CLUB_NUM_ID")
	private Long clubNumId;

	@Column(name = "START_YEAR")
	private String startYear;
	
	@Column(name = "SEMESTER")
	private String semester;
	
	@Column(name = "CLUB_NUM")
	private Long clubNum;
	
	@Column(name = "CRE_AT")
	private Timestamp creAt;

	public ClubNum() {
		super();
	}

	public ClubNum(Long clubNumId, String startYear, String semester, Long clubNum, Timestamp creAt) {
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
