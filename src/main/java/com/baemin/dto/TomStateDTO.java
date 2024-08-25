package com.baemin.dto;

public class TomStateDTO {
	private Long tomSteId;
	private String tomSteName;
	
	public TomStateDTO() {
		super();
	}
	public TomStateDTO(Long tomSteId, String tomSteName) {
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
