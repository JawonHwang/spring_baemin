package com.baemin.dto;

public class AdminDTO {

	private String admin_user_id;	//관리자ID
	private int admin_type_id;		//관리자유형ID

	public AdminDTO() {
		super();
	}

	public AdminDTO(String admin_user_id, int admin_type_id) {
		super();
		this.admin_user_id = admin_user_id;
		this.admin_type_id = admin_type_id;
	}

	public String getAdmin_user_id() {
		return admin_user_id;
	}

	public void setAdmin_user_id(String admin_user_id) {
		this.admin_user_id = admin_user_id;
	}

	public int getAdmin_type_id() {
		return admin_type_id;
	}

	public void setAdmin_type_id(int admin_type_id) {
		this.admin_type_id = admin_type_id;
	}
}
