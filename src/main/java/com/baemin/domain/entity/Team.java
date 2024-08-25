package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TEAMS")
public class Team {
	@Id
	@Column(name = "TEAM_ID")
	private Long teamId;

	@Column(name = "TEAM_NAME")
	private String teamName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLAYERS_ID")
	private Player player;
	
	public Team() {
		super();
	}

	public Team(Long teamId, String teamName, Player player) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.player = player;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
