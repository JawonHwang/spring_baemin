package com.baemin.dto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;

import com.baemin.domain.entity.TomState;

public class TournamentDTO {
	private Long tomId;
	private String tomName;
	private String tomLocation;
	private LocalDate tomYear;
	private LocalDate tomStartDate;
	private LocalDate tomEndDate;
	private TomState TomState;
	private Timestamp creAt;
	private Timestamp uptAt;
	private AdminDTO admin;
	private Long views;
	private Set<MatchTeamDTO> matchTeam;
	
	public TournamentDTO() {
		super();
	}

	public TournamentDTO(Long tomId, String tomName, String tomLocation, LocalDate tomYear, LocalDate tomStartDate,
			LocalDate tomEndDate, com.baemin.domain.entity.TomState tomState, Timestamp creAt, Timestamp uptAt,
			AdminDTO admin, Long views, Set<MatchTeamDTO> matchTeam) {
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

	public AdminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public Set<MatchTeamDTO> getMatchTeam() {
		return matchTeam;
	}

	public void setMatchTeam(Set<MatchTeamDTO> matchTeam) {
		this.matchTeam = matchTeam;
	}
}
