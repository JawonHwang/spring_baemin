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
	private Long mtId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATCH_ID")
	private Match match;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;

	@Column(name="SCORE")
	private Long score;

	@Column(name="D_SCORE")
	private Long dScore;

	@Column(name="IS_WINNER")
	private Boolean isWinner;

	public MatchTeam() {
		super();
	}

	public MatchTeam(Long mtId, Match match, Team team, Long score, Long dScore, Boolean isWinner) {
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
