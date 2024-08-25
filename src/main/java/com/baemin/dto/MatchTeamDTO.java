package com.baemin.dto;

public class MatchTeamDTO {
	private int mtId;
	private MatchDTO match;
	private TeamDTO team;
	private String score;
	private String dScore;
	private String isWinner;
	public MatchTeamDTO() {
		super();
	}
	public MatchTeamDTO(int mtId, MatchDTO match, TeamDTO team, String score, String dScore, String isWinner) {
		super();
		this.mtId = mtId;
		this.match = match;
		this.team = team;
		this.score = score;
		this.dScore = dScore;
		this.isWinner = isWinner;
	}
	public int getMtId() {
		return mtId;
	}
	public void setMtId(int mtId) {
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getdScore() {
		return dScore;
	}
	public void setdScore(String dScore) {
		this.dScore = dScore;
	}
	public String getIsWinner() {
		return isWinner;
	}
	public void setIsWinner(String isWinner) {
		this.isWinner = isWinner;
	}
}
