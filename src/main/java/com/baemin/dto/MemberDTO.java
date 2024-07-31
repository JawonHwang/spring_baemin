package com.baemin.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate birth;
	private String contact;
	private String email;
	private String profile_image;
	private String role;
	
	
	
}
