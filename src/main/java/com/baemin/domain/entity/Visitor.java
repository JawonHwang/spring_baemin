package com.baemin.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WEB_SITE_VISITS")
public class Visitor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="VISIT_ID")
    private Long seq;
	
	@Column(name = "VISIT_DATE", unique = true)
	private LocalDate visitorDate;
	
	@Column(name="VISIT_COUNT")
    private int visitorCount;


	public Visitor(Long seq, LocalDate visitorDate, int visitorCount) {
		super();
		this.seq = seq;
		this.visitorDate = visitorDate;
		this.visitorCount = visitorCount;
	}


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


	public Visitor() {
		super();
    }
}
