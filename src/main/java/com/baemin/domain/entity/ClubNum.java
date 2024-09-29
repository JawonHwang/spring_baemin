package com.baemin.domain.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLUB_NUM")
public class ClubNum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLUB_NUM_ID")
	private Long clubNumId;

	@Column(name = "START_YEAR")
	private int startYear;
	
	@Column(name = "SEMESTER")
	private int semester;
	
	@Column(name = "CLUB_NUM")
	private int clubNum;
	
	@Column(name = "CRE_AT")
	private LocalDate creAt;

	public ClubNum() {
		super();
	}

	public ClubNum(Long clubNumId, int startYear, int semester, int clubNum, LocalDate creAt) {
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
