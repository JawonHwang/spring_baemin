package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MEMBER_TIERS")
public class MemberTier {

	@Id
	@Column(name = "MEM_TIER_ID")
	private Long memTierId;

	@Column(name = "MEM_TIER")
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

	public MemberTier(Long memTierId, String memTier) {
		super();
		this.memTierId = memTierId;
		this.memTier = memTier;
	}

	public MemberTier() {
		super();
	}

}
