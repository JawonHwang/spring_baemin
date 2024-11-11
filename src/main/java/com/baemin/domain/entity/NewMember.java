package com.baemin.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NEW_MEMBERS")
public class NewMember {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NM_ID")
    private Long id;
	
	@Column(name = "NM_DATE", unique = true)
	private LocalDate newMemberDate;
	
	@Column(name="NM_COUNT")
    private Long newMemberCount;

	public NewMember(Long id, LocalDate newMemberDate, Long newMemberCount) {
		super();
		this.id = id;
		this.newMemberDate = newMemberDate;
		this.newMemberCount = newMemberCount;
	}

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

	public NewMember() {
		super();
    }
}
