package com.baemin.dto;

public class PlayerDTO {
	private int playersId;
	private MemberDTO member;
	
	public PlayerDTO() {
		super();
	}

	public PlayerDTO(int playersId, MemberDTO member) {
		super();
		this.playersId = playersId;
		this.member = member;
	}

	public int getPlayersId() {
		return playersId;
	}

	public void setPlayersId(int playersId) {
		this.playersId = playersId;
	}

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}
}
