package com.baemin.dto;

import java.sql.Timestamp;

public class AttendanceDTO {
	
	private int att_id;			//출석ID
	private String mem_id;		//회원ID
	private Boolean is_att;		//출석여부
	private Timestamp att_at;	//출석날짜
	private Timestamp cre_at;	//생성일
	private Timestamp upt_at;	//수정일
	
	public AttendanceDTO() {
		super();
	}
	
	public AttendanceDTO(int att_id, String mem_id, Boolean is_att, Timestamp att_at, Timestamp cre_at,
			Timestamp upt_at) {
		super();
		this.att_id = att_id;
		this.mem_id = mem_id;
		this.is_att = is_att;
		this.att_at = att_at;
		this.cre_at = cre_at;
		this.upt_at = upt_at;
	}

	public int getAtt_id() {
		return att_id;
	}
	public void setAtt_id(int att_id) {
		this.att_id = att_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public Boolean getIs_att() {
		return is_att;
	}
	public void setIs_att(Boolean is_att) {
		this.is_att = is_att;
	}
	public Timestamp getAtt_at() {
		return att_at;
	}
	public void setAtt_at(Timestamp att_at) {
		this.att_at = att_at;
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

}
