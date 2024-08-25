package com.baemin.dto;

import java.sql.Timestamp;

public class NoticeDTO {

	private Integer notId;			//관리자ID
	private String title;		//제목
	private String content;		//내용
	private Integer notTagId;		//태그ID
	private Integer views;			//조회수
	private Integer notSteId;		//상태ID
	private String adminId;		//작성자(관리자)ID
	private Timestamp creAt;	//작성일
	private Timestamp uptAt;	//수정일
	private Timestamp delAt;	//삭제일
		
	public NoticeDTO() {
		super();
	}

	public NoticeDTO(Integer notId, String title, String content, Integer notTagId, Integer views, Integer notSteId, String adminId,
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

	public Integer getNotId() {
		return notId;
	}

	public void setNotId(Integer notId) {
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

	public Integer getNotTagId() {
		return notTagId;
	}

	public void setNotTagId(Integer notTagId) {
		this.notTagId = notTagId;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getNotSteId() {
		return notSteId;
	}

	public void setNotSteId(Integer notSteId) {
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
