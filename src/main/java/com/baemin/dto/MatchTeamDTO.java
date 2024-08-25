package com.baemin.dto;

public class MatchTeamDTO {
	private Long mtId;
	private MatchDTO match;
	private TeamDTO team;
	private Long score;
	private Long dScore;
	private Boolean isWinner;
	public MatchTeamDTO() {
		super();
	}
	public MatchTeamDTO(Long mtId, MatchDTO match, TeamDTO team, Long score, Long dScore, Boolean isWinner) {
		super();
		this.mtId = mtId;
		this.match = match;
		this.team = team;
		this.score = score;
		this.dScore = dScore;
		this.isWinner = isWinner;
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
	public void setMatch(MatchDTO matchDTO) {
		this.match = matchDTO;
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
}
