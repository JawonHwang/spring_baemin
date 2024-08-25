package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATCH_TEAMS")
public class MatchTeam {
	@Id
	@Column(name="MT_ID")
	private int mtId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATCH_ID")
	private Match match;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;

	@Column(name="SCORE")
	private String score;

	@Column(name="D_SCORE")
	private String dScore;

	@Column(name="IS_WINNER")
	private String isWinner;

	public MatchTeam() {
		super();
	}

	public MatchTeam(int mtId, Match match, Team team, String score, String dScore, String isWinner) {
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

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
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
