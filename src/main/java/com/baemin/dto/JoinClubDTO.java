package com.baemin.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class JoinClubDTO {

	private int joId;
	private String joName;
	private String joContact;
	private String joDept;
	private String joStuId;
	private String joGender;
	private Timestamp joApprDate;
	private String joSkill;
	private String joIvIds;
	private String joAdIds;
	private boolean isApp;
	private ClubNumDTO clubNumId;

	public int getJoId() {
		return joId;
	}

	public void setJoId(int joId) {
		this.joId = joId;
	}

	public String getJoName() {
		return joName;
	}

	public void setJoName(String joName) {
		this.joName = joName;
	}

	public String getJoContact() {
		return joContact;
	}

	public void setJoContact(String joContact) {
		this.joContact = joContact;
	}

	public String getJoDept() {
		return joDept;
	}

	public void setJoDept(String joDept) {
		this.joDept = joDept;
	}

	public String getJoStuId() {
		return joStuId;
	}

	public void setJoStuId(String joStuId) {
		this.joStuId = joStuId;
	}

	public String getJoGender() {
		return joGender;
	}

	public void setJoGender(String joGender) {
		this.joGender = joGender;
	}

	public Timestamp getJoApprDate() {
		return joApprDate;
	}

	public void setJoApprDate(Timestamp joApprDate) {
		this.joApprDate = joApprDate;
	}

	public String getJoSkill() {
		return joSkill;
	}

	public void setJoSkill(String joSkill) {
		this.joSkill = joSkill;
	}

	public String getJoIvIds() {
		return joIvIds;
	}

	public void setJoIvIds(String joIvIds) {
		this.joIvIds = joIvIds;
	}

	public String getJoAdIds() {
		return joAdIds;
	}

	public void setJoAdIds(String joAdIds) {
		this.joAdIds = joAdIds;
	}

	public boolean isApp() {
		return isApp;
	}

	public void setApp(boolean isApp) {
		this.isApp = isApp;
	}

	public ClubNumDTO getClubNumId() {
		return clubNumId;
	}

	public void setClubNumId(ClubNumDTO clubNumId) {
		this.clubNumId = clubNumId;
	}

	public JoinClubDTO(int joId, String joName, String joContact, String joDept, String joStuId, String joGender,
			Timestamp joApprDate, String joSkill, String joIvIds, String joAdIds, boolean isApp, ClubNumDTO clubNumId) {
		super();
		this.joId = joId;
		this.joName = joName;
		this.joContact = joContact;
		this.joDept = joDept;
		this.joStuId = joStuId;
		this.joGender = joGender;
		this.joApprDate = joApprDate;
		this.joSkill = joSkill;
		this.joIvIds = joIvIds;
		this.joAdIds = joAdIds;
		this.isApp = isApp;
		this.clubNumId = clubNumId;
	}

	public JoinClubDTO() {
		super();
	}

}
