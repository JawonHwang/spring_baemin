package com.baemin.dto;

import java.sql.Timestamp;

public class NoticeDTO {

	private Long notId;			//관리자ID
	private String title;		//제목
	private String content;		//내용
	private Long notTagId;		//태그ID
	private Long views;			//조회수
	private Long notSteId;		//상태ID
	private String adminId;		//작성자(관리자)ID
	private Timestamp creAt;	//작성일
	private Timestamp uptAt;	//수정일
	private Timestamp delAt;	//삭제일
		
	public NoticeDTO() {
		super();
	}

	public NoticeDTO(Long notId, String title, String content, Long notTagId, Long views, Long notSteId, String adminId,
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

	public Long getNotId() {
		return notId;
	}

	public void setNotId(Long notId) {
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

	public Long getNotTagId() {
		return notTagId;
	}

	public void setNotTagId(Long notTagId) {
		this.notTagId = notTagId;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public Long getNotSteId() {
		return notSteId;
	}

	public void setNotSteId(Long notSteId) {
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
