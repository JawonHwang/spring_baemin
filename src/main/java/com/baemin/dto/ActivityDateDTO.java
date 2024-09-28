package com.baemin.dto;

public class ActivityDateDTO {

	private int adId;
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

	public ActivityDateDTO(int adId, String adDate) {
		super();
		this.adId = adId;
		this.adDate = adDate;
	}

	public ActivityDateDTO() {
		super();
	}

}
