package com.baemin.dto;

public class TomStateDTO {
	private int tomSteId;
	private String tomSteName;
	
	public TomStateDTO() {
		super();
	}
	public TomStateDTO(int tomSteId, String tomSteName) {
		super();
		this.tomSteId = tomSteId;
		this.tomSteName = tomSteName;
	}
	public int getTomSteId() {
		return tomSteId;
	}
	public void setTomSteId(int tomSteId) {
		this.tomSteId = tomSteId;
	}
	public String getTomSteName() {
		return tomSteName;
	}
	public void setTomSteName(String tomSteName) {
		this.tomSteName = tomSteName;
	}
}
