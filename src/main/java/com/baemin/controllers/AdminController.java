package com.baemin.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.AdminDTO;
import com.baemin.dto.MemberDTO;
import com.baemin.services.AdminService;
import com.baemin.services.MemberService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService aServ;
	
	@Autowired
	private MemberService mServ;
	
	//관리
	//회원 관리
	@GetMapping("/management/member")
	public ResponseEntity<List<MemberDTO>> getMemberAll() {
		List<MemberDTO> list = mServ.getMemberAll();
		System.out.println("list : " + list);
		return ResponseEntity.ok(list);
	}

	//관리자 관리
	@GetMapping("/management/admin")
	public ResponseEntity<List<AdminDTO>> getAdminAll() {
		List<AdminDTO> list = aServ.getAdminAll();
		return ResponseEntity.ok(list);
	}
}
