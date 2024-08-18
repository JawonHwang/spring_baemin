package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notice {

	@Id
	@Column(name="NOT_ID")			//공지사항ID
	private int not_id;

	@Column(name="TITLE")			//제목
	private String title;
	
	@Column(name="CONTENT")			//내용
	private String content;
	
	@Column(name="NOT_TAG_ID")		//태그ID
	private int not_tag_id;
	
	@Column(name="VIEWS")			//조회수
	private int views;
	
	@Column(name="NOT_STE_ID")		//상태ID
	private int not_ste_id;
	
	@Column(name="ADMIN_ID")		//작성자(관리자)ID
	private String admin_id;
	
	@Column(name="CRE_AT")			//작성일
	private Timestamp cre_at;
	
	@Column(name="UPT_AT")			//수정일
	private Timestamp upt_at;
	
	@Column(name="DEL_AT")			//삭제일
	private Timestamp del_at;

	public Notice() {
		super();
	}

	public Notice(int not_id, String title, String content, int not_tag_id, int views, int not_ste_id, String admin_id,
			Timestamp cre_at, Timestamp upt_at, Timestamp del_at) {
		super();
		this.not_id = not_id;
		this.title = title;
		this.content = content;
		this.not_tag_id = not_tag_id;
		this.views = views;
		this.not_ste_id = not_ste_id;
		this.admin_id = admin_id;
		this.cre_at = cre_at;
		this.upt_at = upt_at;
		this.del_at = del_at;
	}

	public int getNot_id() {
		return not_id;
	}

	public void setNot_id(int not_id) {
		this.not_id = not_id;
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

	public int getNot_tag_id() {
		return not_tag_id;
	}

	public void setNot_tag_id(int not_tag_id) {
		this.not_tag_id = not_tag_id;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getNot_ste_id() {
		return not_ste_id;
	}

	public void setNot_ste_id(int not_ste_id) {
		this.not_ste_id = not_ste_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public Timestamp getCre_at() {
		return cre_at;
	}

	public void setCre_at(Timestamp cre_at) {
		this.cre_at = cre_at;
	}

	public Timestamp getUpt_at() {
		return upt_at;
	}

	public void setUpt_at(Timestamp upt_at) {
		this.upt_at = upt_at;
	}

	public Timestamp getDel_at() {
		return del_at;
	}

	public void setDel_at(Timestamp del_at) {
		this.del_at = del_at;
	}
}
