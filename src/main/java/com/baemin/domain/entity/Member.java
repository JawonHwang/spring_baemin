package com.baemin.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MEMBERS")
public class Member {

	@Id
	@Column(name="MEM_ID")
	private String memId;
	
	@Column(name="MEM_PW")
	private String memPw;
	
	@Column(name="MEM_NAME")
	private String memName;
	
	@Column(name="MEM_CONTACT")
	private String memContact;
	
	@Column(name="MEM_EMAIL")
	private String memEmail;
	
	@Column(name="MEM_BIRTH", columnDefinition = "TIMESTAMP")
	private LocalDate memBirth;
	
	@Column(name="MEM_DEPT")
	private String memDept;
	
	@Column(name="MEM_STU_ID")
	private String memStuId;
	
	@Column(name="MEM_GENDER")
	private String memGender;
	
	@Column(name="MEM_CLUB_NUM")
	private int memClubNum;
	
	@Column(name="MEM_TIER_ID")
	private int memTierId;
	
	@Column(name="MEM_JOIN_DATE", columnDefinition = "TIMESTAMP")
	private LocalDate memJoinDate;
	
	@Column(name="MEM_APPROVAL_DATE", columnDefinition = "TIMESTAMP")
	private LocalDate memApprovalDate;
	
	@Column(name="ROLE")
	private String role;
	
}
