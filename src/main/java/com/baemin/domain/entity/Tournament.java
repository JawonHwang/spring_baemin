package com.baemin.domain.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOURNAMENTS")
public class Tournament {
	@Id
	@Column(name="TOM_ID")
	private int tomId;

	@Column(name="TOM_NAME")
	private String tomName;

	@Column(name="TOM_LOCATION")
	private String tomLocation;
	
	@Column(name="TOM_YEAR")
	private LocalDate tomYear;
	
	@Column(name="TOM_START_DATE")
	private LocalDate tomStartDate;
	
	@Column(name="TOM_END_DATE")
	private LocalDate tomEndDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TOM_STE_ID")
	private TomState TomState;
	
	@Column(name="CRE_AT")
	private Timestamp creAt;
	
	@Column(name="UPT_AT")
	private Timestamp uptAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADMIN_ID")
	private Admin admin;
	
	@Column(name="VIEWS")
	private int views;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "MT_ID")
	private MatchTeam matchTeam;

	public Tournament() {
		super();
	}

	public Tournament(int tomId, String tomName, String tomLocation, LocalDate tomYear, LocalDate tomStartDate,
			LocalDate tomEndDate, com.baemin.domain.entity.TomState tomState, Timestamp creAt, Timestamp uptAt,
			Admin admin, int views, MatchTeam matchTeam) {
		super();
		this.tomId = tomId;
		this.tomName = tomName;
		this.tomLocation = tomLocation;
		this.tomYear = tomYear;
		this.tomStartDate = tomStartDate;
		this.tomEndDate = tomEndDate;
		TomState = tomState;
		this.creAt = creAt;
		this.uptAt = uptAt;
		this.admin = admin;
		this.views = views;
		this.matchTeam = matchTeam;
	}

	public int getTomId() {
		return tomId;
	}

	public void setTomId(int tomId) {
		this.tomId = tomId;
	}

	public String getTomName() {
		return tomName;
	}

	public void setTomName(String tomName) {
		this.tomName = tomName;
	}

	public String getTomLocation() {
		return tomLocation;
	}

	public void setTomLocation(String tomLocation) {
		this.tomLocation = tomLocation;
	}

	public LocalDate getTomYear() {
		return tomYear;
	}

	public void setTomYear(LocalDate tomYear) {
		this.tomYear = tomYear;
	}

	public LocalDate getTomStartDate() {
		return tomStartDate;
	}

	public void setTomStartDate(LocalDate tomStartDate) {
		this.tomStartDate = tomStartDate;
	}

	public LocalDate getTomEndDate() {
		return tomEndDate;
	}

	public void setTomEndDate(LocalDate tomEndDate) {
		this.tomEndDate = tomEndDate;
	}

	public TomState getTomState() {
		return TomState;
	}

	public void setTomState(TomState tomState) {
		TomState = tomState;
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

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public MatchTeam getMatchTeam() {
		return matchTeam;
	}

	public void setMatchTeam(MatchTeam matchTeam) {
		this.matchTeam = matchTeam;
	}
}
