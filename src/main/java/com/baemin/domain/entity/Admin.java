package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

	@Id
	@Column(name="ADMIN_USER_ID")		//관리자ID
	private String admin_user_id;

	@Column(name="ADMIN_TYPE_ID")		//관리자 유형 ID
	private int admin_type_id;

	public Admin() {
		super();
	}

	public Admin(String admin_user_id, int admin_type_id) {
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
