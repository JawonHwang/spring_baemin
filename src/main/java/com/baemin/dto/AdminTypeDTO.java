package com.baemin.dto;

public class AdminTypeDTO {

	private Integer adminTypeId;		//유형ID
	private String adminTypeName;	//관리자유형
	
	public AdminTypeDTO() {
		super();
	}

	public AdminTypeDTO(Integer adminTypeId, String adminTypeName) {
		super();
		this.adminTypeId = adminTypeId;
		this.adminTypeName = adminTypeName;
	}
	public AdminTypeDTO(String adminTypeName) {
		super();
		this.adminTypeName = adminTypeName;
	}

	public Integer getAdminTypeId() {
		return adminTypeId;
	}

	public void setAdminTypeId(int adminTypeId) {
		this.adminTypeId = adminTypeId;
	}

	public String getAdminTypeName() {
		return adminTypeName;
	}

	public void setAdminTypeName(String adminTypeName) {
		this.adminTypeName = adminTypeName;
	}
}
