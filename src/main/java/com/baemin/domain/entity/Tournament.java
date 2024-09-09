package com.baemin.domain.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;

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
	private Long tomId;

	@Column(name="TOM_NAME")
	private String tomName;

	@Column(name="TOM_LOCATION")
	private String tomLocation;

	@Column(name="TOM_DATE")
	private LocalDate tomDate;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TOM_STE_ID")
	private TomState tomState;

	@Column(name="CRE_AT")
	private Timestamp creAt;

	@Column(name="UPT_AT")
	private Timestamp uptAt;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADMIN_ID")
	private Admin admin;

	@Column(name="VIEWS")
	private Long views;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "MT_ID")
	private Set<MatchTeam> matchTeam;

	public Tournament() {
		super();
	}

	public Tournament(Long tomId, String tomName, String tomLocation, LocalDate tomDate, TomState tomState,
			Timestamp creAt, Timestamp uptAt, Admin admin, Long views, Set<MatchTeam> matchTeam) {
		super();
		this.tomId = tomId;
		this.tomName = tomName;
		this.tomLocation = tomLocation;
		this.tomDate = tomDate;
		this.tomState = tomState;
		this.creAt = creAt;
		this.uptAt = uptAt;
		this.admin = admin;
		this.views = views;
		this.matchTeam = matchTeam;
	}

	public Long getTomId() {
		return tomId;
	}

	public void setTomId(Long tomId) {
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

	public LocalDate getTomDate() {
		return tomDate;
	}

	public void setTomDate(LocalDate tomDate) {
		this.tomDate = tomDate;
	}

	public TomState getTomState() {
		return tomState;
	}

	public void setTomState(TomState tomState) {
		this.tomState = tomState;
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

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public Set<MatchTeam> getMatchTeam() {
		return matchTeam;
	}

	public void setMatchTeam(Set<MatchTeam> matchTeam) {
		this.matchTeam = matchTeam;
	}

}
