package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOINCLUB")
public class JoinClub {

	@Id
	@Column(name = "JO_ID")
	private int joId;

	@Column(name = "JO_NAME")
	private String joName;

	@Column(name = "JO_CONTACT")
	private String joContact;

	@Column(name = "JO_DEPT")
	private String joDept;

	@Column(name = "JO_STU_ID")
	private String joStuId;

	@Column(name = "JO_GENDER")
	private String joGender;

	@Column(name = "JO_APPR_DATE")
	private Timestamp joApprDate;

	@Column(name = "JO_SKILL")
	private String joSkill;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JO_IV_IDS")
	private Interview interview;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JO_AD_IDS")
	private ActivityDate activityDate;

	@Column(name = "IS_APP")
	private boolean isApp;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLUB_NUM_ID")
	private ClubNum clubNumId;

	public JoinClub() {
		super();
	}

	public JoinClub(int joId, String joName, String joContact, String joDept, String joStuId, String joGender,
			Timestamp joApprDate, String joSkill, Interview interview, ActivityDate activityDate, boolean isApp,
			ClubNum clubNumId) {
		super();
		this.joId = joId;
		this.joName = joName;
		this.joContact = joContact;
		this.joDept = joDept;
		this.joStuId = joStuId;
		this.joGender = joGender;
		this.joApprDate = joApprDate;
		this.joSkill = joSkill;
		this.interview = interview;
		this.activityDate = activityDate;
		this.isApp = isApp;
		this.clubNumId = clubNumId;
	}

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

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public ActivityDate getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(ActivityDate activityDate) {
		this.activityDate = activityDate;
	}

	public boolean isApp() {
		return isApp;
	}

	public void setApp(boolean isApp) {
		this.isApp = isApp;
	}

	public ClubNum getClubNumId() {
		return clubNumId;
	}

	public void setClubNumId(ClubNum clubNumId) {
		this.clubNumId = clubNumId;
	}

}
