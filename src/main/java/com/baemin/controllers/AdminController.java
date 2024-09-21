package com.baemin.controllers;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.AdminDTO;
import com.baemin.dto.MemberDTO;
import com.baemin.dto.MemberShipFeeDTO;
import com.baemin.dto.NoticeTagDTO;
import com.baemin.services.AdminService;
import com.baemin.services.MemberService;

import jakarta.transaction.Transactional;

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
		List<MemberDTO> list = aServ.getByMember();
		return ResponseEntity.ok(list);
	}

	//회원관리 > 관리자 권한 부여 && ADMIN 테이블 데이터 생성
	@PostMapping("/management/member/grant-role/{memId}")
		public ResponseEntity<Void> grant(@PathVariable String memId) {
		aServ.grantAdminRole(memId);
		return ResponseEntity.ok().build();
	}
	
	//회원관리 > ban처리
	@PutMapping("/management/member/ban/{memId}")
	public ResponseEntity<Void> banMember(@PathVariable String memId) {
		aServ.banMember(memId);
		return ResponseEntity.ok().build();
	}

	//회원관리 > ban취소
	@PutMapping("/management/member/banCancel/{memId}")
	public ResponseEntity<Void> banCancelMember(@PathVariable String memId) {
		aServ.banCancelMember(memId);
		return ResponseEntity.ok().build();
	}
	
	//회원관리 > 화원 정보 수정
	@PutMapping("/management/member/updateInfo/{memId}")
	public ResponseEntity<Void> updateMemberInfo(@PathVariable String memId, @RequestBody MemberDTO member) {
		aServ.updateMemberInfo(memId, member);
		return ResponseEntity.ok().build();
	}
		
	//관리자관리 > 전체조회
	@GetMapping("/management/admin/getAll")
	public ResponseEntity<List<AdminDTO>> getAdminAll() {
		List<AdminDTO> list = aServ.getAdminAll();
		return ResponseEntity.ok(list);
	}

	//관리자관리 > 관리자 권한 취소
	@PostMapping("/management/admin/revoke-role/{adminId}")
		public ResponseEntity<Void> revoke(@PathVariable String adminId) {
		aServ.revokeAdminRole(adminId);
		return ResponseEntity.ok().build();
	}

	//관리자관리 > 관리자 정보 수정
	@PutMapping("/management/admin/updateInfo/{adminId}")
	public ResponseEntity<Void> updateAdminInfo(@PathVariable String adminId, @RequestBody Map<String, Object> updateFields) {
		System.out.println(adminId);
		System.out.println(updateFields);
		aServ.updateAdminInfo(adminId, updateFields);
		return ResponseEntity.ok().build();
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
