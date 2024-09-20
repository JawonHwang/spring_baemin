package com.baemin.dto;

import java.sql.Timestamp;

public class NoticeTagDTO {
	private Long notTagId;
	private String notTagName;
	private Timestamp creAt;
	private AdminDTO creAdmin;
	private Timestamp uptAt;
	private AdminDTO uptAdmin;
	public Long getNotTagId() {
		return notTagId;
	}
	public void setNotTagId(Long notTagId) {
		this.notTagId = notTagId;
	}
	public String getNotTagName() {
		return notTagName;
	}
	public void setNotTagName(String notTagName) {
		this.notTagName = notTagName;
	}
	public Timestamp getCreAt() {
		return creAt;
	}
	public void setCreAt(Timestamp creAt) {
		this.creAt = creAt;
	}
	public AdminDTO getCreAdmin() {
		return creAdmin;
	}
	public void setCreAdmin(AdminDTO creAdmin) {
		this.creAdmin = creAdmin;
	}
	public Timestamp getUptAt() {
		return uptAt;
	}
	public void setUptAt(Timestamp uptAt) {
		this.uptAt = uptAt;
	}
	public AdminDTO getUptAdmin() {
		return uptAdmin;
	}
	public void setUptAdmin(AdminDTO uptAdmin) {
		this.uptAdmin = uptAdmin;
	}
	public NoticeTagDTO(Long notTagId, String notTagName, Timestamp creAt, AdminDTO creAdmin, Timestamp uptAt,
			AdminDTO uptAdmin) {
		super();
		this.notTagId = notTagId;
		this.notTagName = notTagName;
		this.creAt = creAt;
		this.creAdmin = creAdmin;
		this.uptAt = uptAt;
		this.uptAdmin = uptAdmin;
	}
	public NoticeTagDTO() {
		super();
	}
}
