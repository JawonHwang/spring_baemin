package com.baemin.dto;

public class AdminDTO {
	private String adminId;
	private MemberDTO member;
	private AdminTypeDTO adminType;

	public AdminDTO() {
		super();
	}

	public AdminDTO(String adminId, MemberDTO member, AdminTypeDTO adminType) {
		super();
		this.adminId = adminId;
		this.member = member;
		this.adminType = adminType;
	}

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}

	public AdminTypeDTO getAdminType() {
		return adminType;
	}

	public void setAdminType(AdminTypeDTO adminType) {
		this.adminType = adminType;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
}
