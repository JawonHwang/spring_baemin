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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOTICE_TAGS")
public class NoticeTag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NOT_TAG_ID")		//태그ID
	private Long notTagId;

	@Column(name="NOT_TAG_NAME")	//태그이름
	private String notTagName;
	
	@Column(name="CRE_AT")			//등록일
	private Timestamp creAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRE_ADMIN") //등록자
	private Admin creAdmin;
	
	@Column(name="UPT_AT")			//최종수정일
	private Timestamp uptAt;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "UPT_ADMIN") //최종수정자
	private Admin uptAdmin;
	
	@Column(name="TAG_ORDER")			//순번
	private int order;

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

	public Admin getCreAdmin() {
		return creAdmin;
	}

	public void setCreAdmin(Admin creAdmin) {
		this.creAdmin = creAdmin;
	}

	public Timestamp getUptAt() {
		return uptAt;
	}

	public void setUptAt(Timestamp uptAt) {
		this.uptAt = uptAt;
	}

	public Admin getUptAdmin() {
		return uptAdmin;
	}

	public void setUptAdmin(Admin uptAdmin) {
		this.uptAdmin = uptAdmin;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public NoticeTag(Long notTagId, String notTagName, Timestamp creAt, Admin creAdmin, Timestamp uptAt, Admin uptAdmin,
			int order) {
		super();
		this.notTagId = notTagId;
		this.notTagName = notTagName;
		this.creAt = creAt;
		this.creAdmin = creAdmin;
		this.uptAt = uptAt;
		this.uptAdmin = uptAdmin;
		this.order = order;
	}

	public NoticeTag() {
		super();
	}
}
