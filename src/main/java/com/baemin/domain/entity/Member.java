package com.baemin.domain.entity;

import java.sql.Timestamp;
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
   
   @Column(name="IS_BAN")
   private boolean isBan;
   
   @Column(name="ROLE")
   private String role;

   public String getMemId() {
      return memId;
   }

   public void setMemId(String memId) {
      this.memId = memId;
   }

   public String getMemPw() {
      return memPw;
   }

   public void setMemPw(String memPw) {
      this.memPw = memPw;
   }

   public String getMemName() {
      return memName;
   }

   public void setMemName(String memName) {
      this.memName = memName;
   }

   public String getMemContact() {
      return memContact;
   }

   public void setMemContact(String memContact) {
      this.memContact = memContact;
   }

   public String getMemEmail() {
      return memEmail;
   }

   public void setMemEmail(String memEmail) {
      this.memEmail = memEmail;
   }

   public LocalDate getMemBirth() {
      return memBirth;
   }

   public void setMemBirth(LocalDate memBirth) {
      this.memBirth = memBirth;
   }

   public String getMemDept() {
      return memDept;
   }

   public void setMemDept(String memDept) {
      this.memDept = memDept;
   }

   public String getMemStuId() {
      return memStuId;
   }

   public void setMemStuId(String memStuId) {
      this.memStuId = memStuId;
   }

   public String getMemGender() {
      return memGender;
   }

   public void setMemGender(String memGender) {
      this.memGender = memGender;
   }

   public int getMemClubNum() {
      return memClubNum;
   }

   public void setMemClubNum(int memClubNum) {
      this.memClubNum = memClubNum;
   }

   public int getMemTierId() {
      return memTierId;
   }

   public void setMemTierId(int memTierId) {
      this.memTierId = memTierId;
   }

	public boolean getIsBan() {
		return isBan;
	}
	
	public void setIsBan(boolean isBan) {
		this.isBan = isBan;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public Member() {
	}

	public Member(String memId, String memPw, String memName, String memContact, String memEmail, LocalDate memBirth,
			String memDept, String memStuId, String memGender, int memClubNum, int memTierId, boolean isBan,
			String role) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memContact = memContact;
		this.memEmail = memEmail;
		this.memBirth = memBirth;
		this.memDept = memDept;
		this.memStuId = memStuId;
		this.memGender = memGender;
		this.memClubNum = memClubNum;
		this.memTierId = memTierId;
		this.isBan = isBan;
		this.role = role;
	}
}
