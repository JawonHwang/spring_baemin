package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLAYERS")
public class Player {
	@Id
	@Column(name = "PLAYERS_ID")
	private Long playersId;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "PLAYER")
	private Member member;

	public Player() {
		super();
	}

	public Player(Long playersId, Member member) {
		super();
		this.playersId = playersId;
		this.member = member;
	}

	public Long getPlayersId() {
		return playersId;
	}

	public void setPlayersId(Long playersId) {
		this.playersId = playersId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
