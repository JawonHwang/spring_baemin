package com.baemin.services;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.controllers.AdminController;
import com.baemin.domain.entity.Admin;
import com.baemin.domain.entity.AdminType;
import com.baemin.domain.entity.Member;
import com.baemin.domain.entity.MemberShipFee;
import com.baemin.domain.entity.NoticeTag;
import com.baemin.dto.AdminDTO;
import com.baemin.dto.MemberDTO;
import com.baemin.dto.MemberShipFeeDTO;
import com.baemin.dto.NoticeTagDTO;
import com.baemin.mappers.AdminMapper;
import com.baemin.mappers.AdminTypeMapper;
import com.baemin.mappers.MemberMapper;
import com.baemin.mappers.MemberShipFeeMapper;
import com.baemin.mappers.NoticeTagMapper;
import com.baemin.repositories.AdminRepository;
import com.baemin.repositories.AdminTypeRepository;
import com.baemin.repositories.MemberRepository;
import com.baemin.repositories.MemberShipFeeRepository;
import com.baemin.repositories.NoticeTagRepository;

import jakarta.transaction.Transactional;

@Service
public class AdminService {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private AdminRepository aRepo;

	@Autowired
	private AdminMapper aMapper;
	
	@Autowired
	private AdminTypeRepository atRepo;
	
	@Autowired
	private AdminTypeMapper atMapper;
	
	@Autowired
	private MemberRepository mRepo;
	
	@Autowired
	private MemberMapper mMapper;

	@Autowired
	private NoticeTagRepository ntRepo;

	@Autowired
	private NoticeTagMapper ntMapper;

	@Autowired
	private MemberShipFeeRepository fRepo;

	@Autowired
	private MemberShipFeeMapper fMapper;

	//회원 관리 > 전체조회
	public List<MemberDTO> getByMember() {
		List<Member> list = mRepo.findByRole("ROLE_MEMBER");
		return mMapper.toDtoList(list);
	}

	@Transactional
	public void grantAdminRole(String memId) {
		updateRoleByMemId(memId, "ROLE_ADMIN");
		insertAdmin(memId);
	}

	//회원관리 > 관리자 권한 부여
	public void updateRoleByMemId(String memId, String role) {
		Member member = mRepo.findByMemId(memId);
		member.setRole(role);
		mRepo.save(member);
	}

	//회원관리 > ADMIN 테이블 관리자 데이터 생성
	public void insertAdmin(String memId) {
		Member member = mRepo.findByMemId(memId);

		if (member == null) {
			throw new IllegalArgumentException("해당 ID의 회원을 찾을 수 없습니다.");
		}

		Admin admin = new Admin();
		admin.setMember(member);  // Member 객체와의 관계 설정
		aRepo.save(admin);
	}

	//회원관리 > ban처리
	public void banMember(String memId) {
		Member member = mRepo.findByMemId(memId);
		member.setIsBan(true);
		mRepo.save(member);
	}

	//회원관리 > ban취소
	public void banCancelMember(String memId) {
		Member member = mRepo.findByMemId(memId);
		member.setIsBan(false);
		mRepo.save(member);
	}
	
	//회원관리 > 회원 정보 일부 수정
	public void updateMemberInfo(String memId,MemberDTO member) {
		Member mem = mRepo.findByMemId(memId);
		mem.setMemClubNum(member.getMemClubNum());
		mem.setMemTierId(member.getMemTierId());
		mRepo.save(mem);
	}

	//관리자 관리 > 전체조회
	public List<AdminDTO> getAdminAll() {
		List<Admin> list = aRepo.findAll();
		return aMapper.toDtoList(list);
	}

	@Transactional
	public void revokeAdminRole(String adminId) {
		updateRoleByAdminId(adminId, "ROLE_MEMBER");
		deleteAdmin(adminId);
	}

	//관리자관리 > 관리자 권한 취소
	public void updateRoleByAdminId(String adminId, String role) {
		Member member = mRepo.findByMemId(adminId);
		member.setRole(role);
		mRepo.save(member);
	}
	
	//관리자관리 > 관리자 권한 취소로 관리자 테이블 데이터 삭제
	public void deleteAdmin(String adminId) {
		aRepo.deleteById(adminId);
	}
	
	//관리자관리 > 관리자 정보 일부 수정
	@Transactional
	public void updateAdminInfo(String adminId,Map<String, Object> updateFields) {
		System.out.println(updateFields);
		Map<String, Object> adminTypeMap = (Map<String, Object>) updateFields.get("adminType");
		String adminTypeName = (String) adminTypeMap.get("adminTypeName");
		System.out.println(adminTypeName);
		updateTypeByAdminId(adminId, adminTypeName);

		Map<String, Object> memberMap = (Map<String, Object>) updateFields.get("member");
		System.out.println(memberMap);
		Member member = new Member();
		Integer memClubNum = Integer.parseInt(memberMap.get("memClubNum").toString());
		member.setMemClubNum(memClubNum);
		Integer memTierId = Integer.parseInt(memberMap.get("memTierId").toString());
		member.setMemTierId(memTierId);
		
		System.out.println(memClubNum);
		System.out.println(memTierId);

		updateMemberByAdminId(adminId, member);
	}
	
	//관리자관리 > 관리자 정보 수정 > 관리자 유형 수정
	public void updateTypeByAdminId(String adminId, String adminTypeName) {
		Admin admin = aRepo.findByAdminId(adminId);
		AdminType type = atRepo.findByAdminTypeName(adminTypeName);
		admin.setAdminType(type);
		aRepo.save(admin);
	}

	//관리자관리 > 관리자 정보 수정 > 회원 정보 수정
	public void updateMemberByAdminId(String adminId, Member member) {
		Member mem = mRepo.findByMemId(adminId);
		mem.setMemClubNum(member.getMemClubNum());
		mem.setMemTierId(member.getMemTierId());
		mRepo.save(mem);
	}

	//대회관리 > 태그 > 전체조회
	public List<NoticeTagDTO> getNoticeTagAll() {
		List<NoticeTag> list = ntRepo.findAll();
		return ntMapper.toDtoList(list);
	}

	//회비관리 > 전체조회
	public List<MemberShipFeeDTO> getMemberShipFeeAll() {
		List<MemberShipFee> list = fRepo.findAll();
		return fMapper.toDtoList(list);
	}
}
