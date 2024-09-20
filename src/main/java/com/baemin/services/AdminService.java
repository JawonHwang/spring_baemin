package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.controllers.AdminController;
import com.baemin.domain.entity.Admin;
import com.baemin.domain.entity.Member;
import com.baemin.domain.entity.MemberShipFee;
import com.baemin.domain.entity.NoticeTag;
import com.baemin.dto.AdminDTO;
import com.baemin.dto.MemberShipFeeDTO;
import com.baemin.dto.NoticeTagDTO;
import com.baemin.mappers.AdminMapper;
import com.baemin.mappers.MemberShipFeeMapper;
import com.baemin.mappers.NoticeTagMapper;
import com.baemin.repositories.AdminRepository;
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
	private MemberRepository mRepo;
	
	@Autowired
	private NoticeTagRepository ntRepo;
	
	@Autowired
	private NoticeTagMapper ntMapper;
	
	@Autowired
	private MemberShipFeeRepository fRepo;
	
	@Autowired
	private MemberShipFeeMapper fMapper;
	
	//관리자 관리 > 전체조회
	/*public List<AdminDTO> getAdminAll() {
		List<Admin> list = aRepo.selectAdminAll();
		return aMapper.toDtoList(list);
	}*/
	public List<AdminDTO> getAdminAll() {
		List<Admin> list = aRepo.findAll();
		return aMapper.toDtoList(list);
	}
	/*public List<AdminDTO> getAdminAll() {
			List<Admin> admins = aRepo.findAll();

			List<AdminDTO> adminDTOs = new ArrayList<>();
			for (Admin admin : admins) {
				String memId = admin.getMember().getMemId();
				int adminTypeId = admin.getAdminType().getAdminTypeId();
				Member member = mRepo.findByMemId(memId);

				if (member != null) {
					AdminDTO dto = new AdminDTO();
					dto.setAdminId(admin.getMember().getMemId());
					dto.setMember(new MemberDTO(
						member.getMemId(),
						member.getMemPw(),
						member.getMemName(),
						member.getMemContact(),
						member.getMemEmail(),
						member.getMemBirth(),
						member.getMemDept(),
						member.getMemStuId(),
						member.getMemGender(),
						member.getMemClubNum(),
						member.getMemTierId()
				));
					dto.setAdminType(new AdminTypeDTO(admin.getAdminType().getAdminTypeName()));
					adminDTOs.add(dto);
				}
			}
			return adminDTOs;
	}*/
	@Transactional
	public void grantAdminRole(String memId) {
		updateRoleByMemId(memId, "ADMIN");
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
		Admin admin = new Admin();
		admin.setAdminId(memId);
		aRepo.save(admin);
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
