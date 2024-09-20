package com.baemin.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.AdminDTO;
import com.baemin.dto.MemberDTO;
import com.baemin.dto.MemberShipFeeDTO;
import com.baemin.dto.NoticeTagDTO;
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
	//회원관리 > 전체조회
	@GetMapping("/management/member/getAll")
	public ResponseEntity<List<MemberDTO>> getMemberAll() {
		List<MemberDTO> list = mServ.getMemberAll();
		return ResponseEntity.ok(list);
	}

	//회원관리 > 관리자 권한 부여 && ADMIN 테이블 데이터 생성
	@PutMapping("/management/member/grant-role/{memId}")
		public ResponseEntity<Void> revoke(@PathVariable String memId) {
		aServ.grantAdminRole(memId);
		return ResponseEntity.ok().build();
	}

	//관리자관리 > 전체조회
	@GetMapping("/management/admin/getAll")
	public ResponseEntity<List<AdminDTO>> getAdminAll() {
		List<AdminDTO> list = aServ.getAdminAll();
		return ResponseEntity.ok(list);
	}
	
	//대회관리 > 태그 > 전체조회
	@GetMapping("/management/noticeTag/getAll")
	public ResponseEntity<List<NoticeTagDTO>> getNoticeTagAll() {
		List<NoticeTagDTO> list = aServ.getNoticeTagAll();
		return ResponseEntity.ok(list);
	}
	
	//회비관리 > 전체조회
	@GetMapping("/management/memberShipFee/getAll")
	public ResponseEntity<List<MemberShipFeeDTO>> getMemberShipFeeAll() {
		List<MemberShipFeeDTO> list = aServ.getMemberShipFeeAll();
		System.out.println("list : " + list.get(0).getPayMethod().getPayMthName());
		System.out.println("list : " + list.get(0).getMember().getMemId());
		return ResponseEntity.ok(list);
	}
}
