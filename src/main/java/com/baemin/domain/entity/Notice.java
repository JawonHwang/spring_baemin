package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOTICES")
public class Notice {

	@Id
	@Column(name="NOT_ID")		//공지사항ID
	private int notId;

	@Column(name="TITLE")		//제목
	private String title;
	
	@Column(name="CONTENT")		//내용
	private String content;
	
	@Column(name="NOT_TAG_ID")	//태그ID
	private int notTagId;
	
	@Column(name="VIEWS")		//조회수
	private int views;
	
	@Column(name="NOT_STE_ID")	//상태ID
	private int notSteId;
	
	@Column(name="ADMIN_ID")	//작성자(관리자)ID
	private String adminId;
	
	@Column(name="CRE_AT")		//작성일
	private Timestamp creAt;
	
	@Column(name="UPT_AT")		//수정일
	private Timestamp uptAt;
	
	@Column(name="DEL_AT")		//삭제일
	private Timestamp delAt;

	public Notice() {
		super();
	}

	public Notice(int notId, String title, String content, int notTagId, int views, int notSteId, String adminId,
			Timestamp creAt, Timestamp uptAt, Timestamp delAt) {
		super();
		this.notId = notId;
		this.title = title;
		this.content = content;
		this.notTagId = notTagId;
		this.views = views;
		this.notSteId = notSteId;
		this.adminId = adminId;
		this.creAt = creAt;
		this.uptAt = uptAt;
		this.delAt = delAt;
	}

	public int getNotId() {
		return notId;
	}

	public void setNotId(int notId) {
		this.notId = notId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNotTagId() {
		return notTagId;
	}

	public void setNotTagId(int notTagId) {
		this.notTagId = notTagId;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getNotSteId() {
		return notSteId;
	}

	public void setNotSteId(int notSteId) {
		this.notSteId = notSteId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Timestamp getCreAt() {
		return creAt;
	}

	public void setCreAt(Timestamp creAt) {
		this.creAt = creAt;
	}

	public Timestamp getUptAt() {
		return uptAt;
	}

	public void setUptAt(Timestamp uptAt) {
		this.uptAt = uptAt;
	}

	public Timestamp getDelAt() {
		return delAt;
	}

	public void setDelAt(Timestamp delAt) {
		this.delAt = delAt;
	}
}