package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMIN_TYPES")
public class AdminType {

	@Id
	@Column(name="ADMIN_TYPE_ID")
	private Integer adminTypeId;	//유형ID
	
	@Column(name="ADMIN_TYPE_NAME")
	private String adminTypeName;	//관리자유형

	public AdminType() {
		super();
	}

	public AdminType(Integer adminTypeId, String adminTypeName) {
		super();
		this.adminTypeId = adminTypeId;
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
