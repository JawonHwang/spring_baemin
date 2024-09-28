package com.baemin.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOINCLUB")
public class JoinClub {

	@Id
	@Column(name="JO_ID")
	private int joId;

	@Column(name="JO_NAME")
	private String joName;

	@Column(name="JO_CONTACT")
	private String joContact;

	@Column(name="JO_DEPT")
	private String joDept;

	@Column(name="JO_STU_ID")
	private String joStuId;

	@Column(name="JO_GENDER")
	private String joGender;
	
	@Column(name="JO_APPR_DATE", columnDefinition = "TIMESTAMP")
	private LocalDate joApprDate;
	
	@Column(name="JO_SKILL")
	private String joSkill;

	@Column(name="JO_IV_IDS")
	private String joIvIds;

	@Column(name="JO_AD_IDS")
	private String joAdIds;

	@Column(name="IS_APP")
	private boolean isApp;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "CLUB_NUM_ID")
//	private ClubNum clubNumId;
	
}
