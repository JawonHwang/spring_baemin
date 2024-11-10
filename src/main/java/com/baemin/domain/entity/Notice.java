package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOTICES")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NOT_ID")		//공지사항ID
	private Long notId;

	@Column(name="TITLE")		//제목
	private String title;
	
	@Column(name="CONTENT")		//내용
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="NOT_TAG_ID")
	private NoticeTag tag;
	
	@Column(name="VIEWS")		//조회수
	private Long views;
	
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

	public Notice(Long notId, String title, String content, NoticeTag tag, Long views, String adminId, Timestamp creAt,
			Timestamp uptAt, Timestamp delAt) {
		super();
		this.notId = notId;
		this.title = title;
		this.content = content;
		this.tag = tag;
		this.views = views;
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

	public NoticeTag getTag() {
		return tag;
	}

	public void setTag(NoticeTag tag) {
		this.tag = tag;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
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
