package com.baemin.dto;

public class PlayerDTO {
	private Long playersId;
	private MemberDTO member;
	
	public PlayerDTO() {
		super();
	}

	public PlayerDTO(Long playersId, MemberDTO member) {
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

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}
}
