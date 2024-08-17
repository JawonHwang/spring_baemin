package com.baemin.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MemberDTO {

	private String memId;
	private String memPw;
	private String memName;
	private String memContact;
	private String memEmail;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate memBirth;
    private String memDept;
    private String memStuId;
    private String memGender;
    private int memClubNum;
    private int memTierId;   
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate memJoinDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate memApprovalDate;
	private String role;
	
}
