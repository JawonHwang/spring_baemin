package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMINS")
public class Admin {
	
	@Id
	@Column(name = "ADMIN_ID")
	private String adminId;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "ADMIN_ID", insertable = false, updatable = false)
	private Member member;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADMIN_TYPE_ID", insertable = false, updatable = false)
	private AdminType adminType;

	public Admin() {
		super();
	}

	public Admin(Member member, AdminType adminType) {
		super();
		this.member = member;
		this.adminType = adminType;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public AdminType getAdminType() {
		return adminType;
	}

	public void setAdminType(AdminType adminType) {
		this.adminType = adminType;
	}
}