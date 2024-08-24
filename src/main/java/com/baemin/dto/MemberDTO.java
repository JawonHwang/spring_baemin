package com.baemin.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MemberDTO {

	private String memId;
	private String memPw;
	private String memName;
	private String memContact;
	private String memEmail;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate memBirth;
    private String memDept;
    private String memStuId;
    private String memGender;
    private int memClubNum;
    private int memTierId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp memJoinDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp memApprovalDate;
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
	public Timestamp getMemJoinDate() {
		return memJoinDate;
	}
	public void setMemJoinDate(Timestamp memJoinDate) {
		this.memJoinDate = memJoinDate;
	}
	public Timestamp getMemApprovalDate() {
		return memApprovalDate;
	}
	public void setMemApprovalDate(Timestamp memApprovalDate) {
		this.memApprovalDate = memApprovalDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public MemberDTO(String memId, String memPw, String memName, String memContact, String memEmail, LocalDate memBirth,
			String memDept, String memStuId, String memGender, int memClubNum, int memTierId, Timestamp memJoinDate,
			Timestamp memApprovalDate, String role) {
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
		this.memJoinDate = memJoinDate;
		this.memApprovalDate = memApprovalDate;
		this.role = role;
	}
}
