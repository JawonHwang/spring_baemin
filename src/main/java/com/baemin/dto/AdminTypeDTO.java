package com.baemin.dto;

public class AdminTypeDTO {

	private int admin_type_id;		//유형ID
	private String admin_type_name;	//관리자유형
	
	public AdminTypeDTO() {
		super();
	}
	
	public AdminTypeDTO(int admin_type_id, String admin_type_name) {
		super();
		this.admin_type_id = admin_type_id;
		this.admin_type_name = admin_type_name;
	}

	public int getAdmin_type_id() {
		return admin_type_id;
	}
	public void setAdmin_type_id(int admin_type_id) {
		this.admin_type_id = admin_type_id;
	}
	public String getAdmin_type_name() {
		return admin_type_name;
	}
	public void setAdmin_type_name(String admin_type_name) {
		this.admin_type_name = admin_type_name;
	}
}
