package com.baemin.dto;

import java.time.LocalDate;

public class NewMemberDTO {
	private Long id;
	private LocalDate newMemberDate;
	private Long newMemberCount;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getNewMemberDate() {
		return newMemberDate;
	}

	public void setNewMemberDate(LocalDate newMemberDate) {
		this.newMemberDate = newMemberDate;
	}

	public Long getNewMemberCount() {
		return newMemberCount;
	}

	public void setNewMemberCount(Long newMemberCount) {
		this.newMemberCount = newMemberCount;
	}

	public NewMemberDTO() {
		super();
	}

	public NewMemberDTO(Long id, LocalDate newMemberDate, Long newMemberCount) {
		super();
		this.id = id;
		this.newMemberDate = newMemberDate;
		this.newMemberCount = newMemberCount;
	}
	
	
}
