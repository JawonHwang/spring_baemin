package com.baemin.dto;

import java.sql.Timestamp;

public class MatchTeamDTO {
	private Long mtId;
	private MatchDTO match;
	private TeamDTO team;
	private Long score;
	private Long dScore;
	private Boolean isWinner;
	private Timestamp tomStartDate;
	private Timestamp tomEndDate;
	
	public MatchTeamDTO() {
		super();
	}

	public MatchTeamDTO(Long mtId, MatchDTO match, TeamDTO team, Long score, Long dScore, Boolean isWinner,
			Timestamp tomStartDate, Timestamp tomEndDate) {
		super();
		this.mtId = mtId;
		this.match = match;
		this.team = team;
		this.score = score;
		this.dScore = dScore;
		this.isWinner = isWinner;
		this.tomStartDate = tomStartDate;
		this.tomEndDate = tomEndDate;
	}

	public Long getMtId() {
		return mtId;
	}

	public void setMtId(Long mtId) {
		this.mtId = mtId;
	}

	public MatchDTO getMatch() {
		return match;
	}

	public void setMatch(MatchDTO match) {
		this.match = match;
	}

	public TeamDTO getTeam() {
		return team;
	}

	public void setTeam(TeamDTO team) {
		this.team = team;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getdScore() {
		return dScore;
	}

	public void setdScore(Long dScore) {
		this.dScore = dScore;
	}

	public Boolean getIsWinner() {
		return isWinner;
	}

	public void setIsWinner(Boolean isWinner) {
		this.isWinner = isWinner;
	}

	public Timestamp getTomStartDate() {
		return tomStartDate;
	}

	public void setTomStartDate(Timestamp tomStartDate) {
		this.tomStartDate = tomStartDate;
	}

	public Timestamp getTomEndDate() {
		return tomEndDate;
	}

	public void setTomEndDate(Timestamp tomEndDate) {
		this.tomEndDate = tomEndDate;
	}
	
}
