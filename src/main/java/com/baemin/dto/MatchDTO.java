package com.baemin.dto;

import java.sql.Timestamp;

public class MatchDTO {
	private Long matchId;
	private String matchName;
	private String matchStage;
	private Timestamp matchDateTime;
	public MatchDTO() {
		super();
	}
	public MatchDTO(Long matchId, String matchName, String matchStage, Timestamp matchDateTime) {
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
