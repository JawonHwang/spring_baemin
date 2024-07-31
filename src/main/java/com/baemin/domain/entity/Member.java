package com.baemin.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="pw")
	private String pw;
	
	@Column(name="name")
	private String name;
	
	@Column(name="birth", columnDefinition = "TIMESTAMP")
	private LocalDate birth;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="email")
	private String email;
	
	@Column(name="profile_image")
	private String profile_image;
	
	@Column(name="role")
	private String role;
	
}
