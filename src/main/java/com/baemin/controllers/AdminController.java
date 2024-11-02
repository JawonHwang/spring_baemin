package com.baemin.controllers;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.domain.entity.Attendance;
import com.baemin.dto.AdminDTO;
import com.baemin.dto.AttendanceDTO;
import com.baemin.dto.FeeDetailDTO;
import com.baemin.dto.JoinClubDTO;
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
	
	//비회원관리 > 전체조회
	@GetMapping("/management/nonMember/getAll")
	public ResponseEntity<List<JoinClubDTO>> getNonMemberAll() {
		List<JoinClubDTO> list = aServ.getNonMemberAll();
		return ResponseEntity.ok(list);
	}
	
	//비회원관리 > 신청폼 > 승인
	@PutMapping("/management/nonMember/form/approve/{joId}")
		public ResponseEntity<Void> nonMemberApprove(@PathVariable int joId) {
		aServ.nonMemberApprove(joId);
		return ResponseEntity.ok().build();
	}
	
	//비회원관리 > 신청폼 > 반려
	@PutMapping("/management/nonMember/form/disApprove/{joId}")
		public ResponseEntity<Void> nonMemberDisApprove(@PathVariable int joId) {
		aServ.nonMemberDisApprove(joId);
		return ResponseEntity.ok().build();
	}
	
	
	//비회원관리 > 신청폼 > 반려
	
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
		aServ.updateAdminInfo(adminId, updateFields);
		return ResponseEntity.ok().build();
	}

	//공지사항관리 > 태그 > 전체조회
	@GetMapping("/management/noticeTag/getAll")
	public ResponseEntity<List<NoticeTagDTO>> getNoticeTagAll() {
		List<NoticeTagDTO> list = aServ.getNoticeTagAll();
		return ResponseEntity.ok(list);
	}
	
	//공지사항관리 > 태그 > 등록
	@PostMapping("/management/noticeTag/insert")
	public ResponseEntity<Void> noticeTagInsert(@RequestBody NoticeTagDTO noticeTagDTO) {
		String notTagName = noticeTagDTO.getNotTagName();
		aServ.noticeTagInsert(notTagName);
		return ResponseEntity.ok().build();
	}
	
	//공지사항관리 > 태그 > 수정
	@PutMapping("/management/noticeTag/update/{notTagId}")
	public ResponseEntity<Void> updateByNotTagId(@PathVariable Long notTagId, @RequestBody NoticeTagDTO noticeTagDTO) {
		aServ.updateByNotTagId(notTagId, noticeTagDTO);
		return ResponseEntity.ok().build();
	}
	
	//공지사항관리 > 태그 > 순서수정
	@PutMapping("/management/noticeTag/updateOrder")
	public ResponseEntity<Void> updateOrder( @RequestBody List<NoticeTagDTO> noticeTagDTOList) {
		aServ.updateOrder(noticeTagDTOList);
		return ResponseEntity.ok().build();
	}
	
	//공지사항관리 > 태그 > 삭제
	@DeleteMapping("/management/noticeTag/delete/{notTagId}")
	public ResponseEntity<Void> deleteByNotTagId(@PathVariable Long notTagId) {
	    aServ.deleteByNotTagId(notTagId);
	    return ResponseEntity.ok().build();
	}

	
	//회비관리 > 전체조회
	@GetMapping("/management/memberShipFee/getAll/{currentMonth}")
	public ResponseEntity<List<MemberShipFeeDTO>> getMemberShipFeeAllByCreAt(@PathVariable String currentMonth) {
        List<MemberShipFeeDTO> list = aServ.getMemberShipFeeAllByCreAt(currentMonth);
        return ResponseEntity.ok(list);
    }
	
	//회비관리 > 회비 정보 수정
	@PutMapping("/management/fee/updateInfo/{feeId}")
	public ResponseEntity<Void> updateFeeInfo(@PathVariable Long feeId, @RequestBody MemberShipFeeDTO fee) {
		aServ.updateFeeInfo(feeId, fee);
		return ResponseEntity.ok().build();
	}
	
	//회비세부사항관리 > 전체조회
	@GetMapping("/management/feeDetail/getAll")
	public ResponseEntity<List<FeeDetailDTO>> getFeeDetailAll() {
		List<FeeDetailDTO> list = aServ.getFeeDetailAll();
		return ResponseEntity.ok(list);
	}
	
	//회비세부사항관리 > 등록
	@PostMapping("/management/feeDetail/insert")
	public ResponseEntity<Void> insert(@RequestBody FeeDetailDTO feeDatail) {
		aServ.insertFeeDetailInfo(feeDatail);
		return ResponseEntity.ok().build();
	}
	
	//회비세부사항관리 > 수정
	@PutMapping("/management/feeDetail/feeDetailInfo/{feeDetailId}")
	public ResponseEntity<Void> feeDetailInfo(@PathVariable Long feeDetailId, @RequestBody FeeDetailDTO feeDatail) {
		aServ.feeDetailInfo(feeDetailId, feeDatail);
		return ResponseEntity.ok().build();
	}
	
	//공통 > 정지 안된 회원만 조회
	@GetMapping("/management/common/getMemberbyIsBan")
	public ResponseEntity<List<MemberDTO>> getMemberByIsBan() {
		List<MemberDTO> list = mServ.getMemberByIsBan();
		return ResponseEntity.ok(list);
	}
	
	//출석관리 > 회원출석 정보 수정
	@PostMapping("/management/attendance/saveAll")
	public ResponseEntity<Void> updateAttInfo(@RequestBody List<AttendanceDTO> attendanceDataList) {
		aServ.updateAttInfo(attendanceDataList);
		return ResponseEntity.ok().build();
	}
	
	//출석관리 > 해당월 전체조회
	@GetMapping("/management/attendance/monthGetAll")
	public List<Attendance> getAttendanceByMonth(@RequestParam int year, @RequestParam int month) {
        return aServ.getAttendanceByMonth(year, month);
    }
}
