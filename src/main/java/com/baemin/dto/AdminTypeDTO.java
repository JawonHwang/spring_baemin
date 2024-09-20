package com.baemin.dto;

public class AdminTypeDTO {

	private Long adminTypeId;		//유형ID
	private String adminTypeName;	//관리자유형
	
	public AdminTypeDTO() {
		super();
	}

	public AdminTypeDTO(Long adminTypeId, String adminTypeName) {
		super();
		this.adminTypeId = adminTypeId;
		this.adminTypeName = adminTypeName;
	}

	public Long getAdminTypeId() {
		return adminTypeId;
	}

	public void setAdminTypeId(Long adminTypeId) {
		this.adminTypeId = adminTypeId;
	}

	public String getAdminTypeName() {
		return adminTypeName;
	}

	public void setAdminTypeName(String adminTypeName) {
		this.adminTypeName = adminTypeName;
	}
}
