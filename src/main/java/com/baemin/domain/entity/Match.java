package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATCHS")
public class Match {
	@Id
	@Column(name="MATCH_ID")
	private Long matchId;

	@Column(name="MATCH_NAME")
	private String matchName;

	@Column(name="MATCH_STAGE")
	private String matchStage;

	@Column(name="MATCH_DATE_TIME")
	private Timestamp matchDateTime;
	
	public Match() {
		super();
	}

	public Match(Long matchId, String matchName, String matchStage, Timestamp matchDateTime) {
		super();
		this.matchId = matchId;
		this.matchName = matchName;
		this.matchStage = matchStage;
		this.matchDateTime = matchDateTime;
	}

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public String getMatchStage() {
		return matchStage;
	}

	public void setMatchStage(String matchStage) {
		this.matchStage = matchStage;
	}

	public Timestamp getMatchDateTime() {
		return matchDateTime;
	}

	public void setMatchDateTime(Timestamp matchDateTime) {
		this.matchDateTime = matchDateTime;
	}
	
	
}
