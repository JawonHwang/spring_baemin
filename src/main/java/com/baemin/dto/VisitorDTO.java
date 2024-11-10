package com.baemin.dto;

import java.time.LocalDate;

public class VisitorDTO {
	private Long seq;
	private LocalDate visitorDate;
	private int visitorCount;
	
	public Long getSeq() {
		return seq;
	}


	public void setSeq(Long seq) {
		this.seq = seq;
	}


	public LocalDate getVisitorDate() {
		return visitorDate;
	}


	public void setVisitorDate(LocalDate visitorDate) {
		this.visitorDate = visitorDate;
	}


	public int getVisitorCount() {
		return visitorCount;
	}


	public void setVisitorCount(int visitorCount) {
		this.visitorCount = visitorCount;
	}


	public VisitorDTO() {
		super();
	}
	
	
}
