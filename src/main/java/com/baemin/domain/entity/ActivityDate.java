package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACTIVITY_DATE")
public class ActivityDate {

	@Id
	@Column(name = "AD_ID")
	private int adId;

	@Column(name = "AD_DATE")
	private String adDate;

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public String getAdDate() {
		return adDate;
	}

	public void setAdDate(String adDate) {
		this.adDate = adDate;
	}

	public ActivityDate(int adId, String adDate) {
		super();
		this.adId = adId;
		this.adDate = adDate;
	}

	public ActivityDate() {
		super();
	}

}
