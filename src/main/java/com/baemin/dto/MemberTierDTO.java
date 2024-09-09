package com.baemin.dto;

public class MemberTierDTO {

	private Long memTierId;
	private String memTier;

	public Long getMemTierId() {
		return memTierId;
	}

	public void setMemTierId(Long memTierId) {
		this.memTierId = memTierId;
	}

	public String getMemTier() {
		return memTier;
	}

	public void setMemTier(String memTier) {
		this.memTier = memTier;
	}

	public MemberTierDTO(Long memTierId, String memTier) {
		super();
		this.memTierId = memTierId;
		this.memTier = memTier;
	}

	public MemberTierDTO() {
		super();
	}

}
