package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOURNAMENTS")
public class TomState {
	@Id
	@Column(name="TOM_STE_ID")
	private Long tomSteId;

	@Column(name="TOM_STE_NAME")
	private String tomSteName;
	
	public TomState() {
		super();
	}

	public TomState(Long tomSteId, String tomSteName) {
		super();
		this.tomSteId = tomSteId;
		this.tomSteName = tomSteName;
	}

	public Long getTomSteId() {
		return tomSteId;
	}

	public void setTomSteId(Long tomSteId) {
		this.tomSteId = tomSteId;
	}

	public String getTomSteName() {
		return tomSteName;
	}

	public void setTomSteName(String tomSteName) {
		this.tomSteName = tomSteName;
	}
}
