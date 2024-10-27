package com.baemin.domain.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

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
@Table(name = "ATTENDANCES")
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ATT_ID")		//출석ID
	private Long attId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MEM_ID")
	private Member member;

	@Column(name="ATT_STATE")	//출석상태
	private String attState;

	@Column(name="ATT_AT")		//출석날짜
	private LocalDate attAt;

	@Column(name="CRE_AT")		//생성일
	private Timestamp creAt;

	@Column(name="UPT_AT")		//수정일
	private Timestamp uptAt;
	
	@ManyToOne(fetch = FetchType.EAGER) // 수정자
	@JoinColumn(name = "UPT_ADMIN")
	private Admin admin;


	public Attendance() {
		super();
	}

	public Attendance(Long attId, Member member, String attState, LocalDate attAt, Timestamp creAt, Timestamp uptAt,
			Admin admin) {
		super();
		this.attId = attId;
		this.member = member;
		this.attState = attState;
		this.attAt = attAt;
		this.creAt = creAt;
		this.uptAt = uptAt;
		this.admin = admin;
	}

	public Long getAttId() {
		return attId;
	}

	public void setAttId(Long attId) {
		this.attId = attId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getAttState() {
		return attState;
	}

	public void setAttState(String attState) {
		this.attState = attState;
	}

	public LocalDate getAttAt() {
		return attAt;
	}

	public void setAttAt(LocalDate attAt) {
		this.attAt = attAt;
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
