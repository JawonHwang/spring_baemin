package com.baemin.services;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.ActivityDate;
import com.baemin.domain.entity.Admin;
import com.baemin.domain.entity.AdminType;
import com.baemin.domain.entity.Attendance;
import com.baemin.domain.entity.ClubNum;
import com.baemin.domain.entity.FeeDetail;
import com.baemin.domain.entity.Interview;
import com.baemin.domain.entity.JoinClub;
import com.baemin.domain.entity.Member;
import com.baemin.domain.entity.MemberShipFee;
import com.baemin.domain.entity.MemberTier;
import com.baemin.domain.entity.Notice;
import com.baemin.domain.entity.NoticeTag;
import com.baemin.dto.AdminDTO;
import com.baemin.dto.AttendanceDTO;
import com.baemin.dto.FeeDetailDTO;
import com.baemin.dto.JoinClubDTO;
import com.baemin.dto.MemberDTO;
import com.baemin.dto.MemberShipFeeDTO;
import com.baemin.dto.NoticeDTO;
import com.baemin.dto.NoticeTagDTO;
import com.baemin.mappers.AdminMapper;
import com.baemin.mappers.AdminTypeMapper;
import com.baemin.mappers.AttendanceMapper;
import com.baemin.mappers.FeeDetailMapper;
import com.baemin.mappers.JoinClubMapper;
import com.baemin.mappers.MemberMapper;
import com.baemin.mappers.MemberShipFeeMapper;
import com.baemin.mappers.MemberTierMapper;
import com.baemin.mappers.NoticeMapper;
import com.baemin.mappers.NoticeTagMapper;
import com.baemin.repositories.ActivityDateRepository;
import com.baemin.repositories.AdminRepository;
import com.baemin.repositories.AdminTypeRepository;
import com.baemin.repositories.AttendanceRepository;
import com.baemin.repositories.ClubNumRepository;
import com.baemin.repositories.FeeDetailRepository;
import com.baemin.repositories.InterviewRepository;
import com.baemin.repositories.JoinClubRepository;
import com.baemin.repositories.MemberRepository;
import com.baemin.repositories.MemberShipFeeRepository;
import com.baemin.repositories.MemberTierRepository;
import com.baemin.repositories.NoticeRepository;
import com.baemin.repositories.NoticeTagRepository;
import com.baemin.security.SecurityUser;

import jakarta.transaction.Transactional;

@Service
public class AdminService {
	private static final Logger logger = LoggerFactory.getLogger(AdminService.class);

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
	private NoticeRepository nRepo;
	
	@Autowired
	private NoticeMapper nMapper;
	
	@Autowired
	private NoticeTagRepository ntRepo;

	@Autowired
	private NoticeTagMapper ntMapper;

	@Autowired
	private MemberShipFeeRepository fRepo;

	@Autowired
	private MemberShipFeeMapper fMapper;
	
	@Autowired
	private MemberTierRepository tiRepo;
	
	@Autowired
	private MemberTierMapper tiMapper;
	
	@Autowired
	private FeeDetailRepository fdRepo;
	
	@Autowired
	private FeeDetailMapper fdMapper;
	
	@Autowired
	private AttendanceRepository attRepo;
	
	@Autowired
	private AttendanceMapper attMapper;
	
	@Autowired
	private JoinClubRepository joinRepo; //가입신청
	
	@Autowired
	private JoinClubMapper joinMapper;
	
	@Autowired
	private InterviewRepository interviewRepo;

	@Autowired
	private ActivityDateRepository activityRepo;

	@Autowired
	private ClubNumRepository clubNunRepo;
	
	
	//사용자 정보
	private SecurityUser getUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if(auth!=null && auth.getPrincipal() instanceof SecurityUser) {
			SecurityUser su = (SecurityUser)auth.getPrincipal();
			return su;
		}
		return null;//getUser().getUsername()
	}
	
	//비회원 관리 > 전체조회 TODO:하드코어 제회하고 MANYTOONE으로 변경해보기
	public List<JoinClubDTO> getNonMemberAll() {
	    // 모든 JoinClub 엔티티를 가져옵니다.
	    List<JoinClub> list = joinRepo.findAll();
	    
	    // 결과를 담을 DTO 리스트
	    List<JoinClubDTO> resultList = new ArrayList<>();

	    for (JoinClub joinClub : list) {
	        // joIvIds에서 ID를 분리합니다.
	        String joIvIds = joinClub.getJoIvIds(); // 예: "1,2,3"
	        String[] ivIdsArray = joIvIds.split(","); // ID들을 분리하여 배열에 담습니다.

	        // 각 ID에 대해 INTERVIEW 테이블에서 ivDate를 조회합니다.
	        List<String> ivDates = new ArrayList<>();
	        for (String ivId : ivIdsArray) {
	            // INTERVIEW 테이블에서 ivDate를 가져옵니다.
	        	Interview ivDate = interviewRepo.findByIvId(Integer.parseInt(ivId)); // id를 Integer로 변환하여 조회
	            
	            // ivDate가 null이 아닌 경우에만 추가
	            if (ivDate != null) {
	                ivDates.add(ivDate.getIvDate());
	            }
	        }

	        // ivDates를 문자열로 변환 (예: "2024-11-01,2024-11-02")
	        String joinedIvDates = String.join(",", ivDates);

	        // joAdIds에서 ID를 분리합니다.
	        String joAdIds = joinClub.getJoAdIds(); // 예: "1,3"
	        String[] adIdsArray = joAdIds.split(","); // ID들을 분리하여 배열에 담습니다.

	        // 각 ID에 대해 ACTIVITY_DATE 테이블에서 adDate를 조회합니다.
	        List<String> adDates = new ArrayList<>();
	        for (String adId : adIdsArray) {
	            // ACTIVITY_DATE 테이블에서 adDate를 가져옵니다.
	            ActivityDate activityDate = activityRepo.findByAdId(Integer.parseInt(adId)); // id를 Integer로 변환하여 조회
	            
	            // activityDate가 null이 아닌 경우에만 추가
	            if (activityDate != null) {
	                adDates.add(activityDate.getAdDate()); // ActivityDate에서 adDate 필드를 추출하여 추가
	            }
	        }

	        // adDates를 문자열로 변환 (예: "2024-11-01,2024-11-02")
	        String joinedAdDates = String.join(",", adDates);

	        // DTO로 변환
	        JoinClubDTO dto = joinMapper.toDto(joinClub);
	        dto.setJoIvIds(joinedIvDates); // ivDates를 DTO에 설정
	        dto.setJoAdIds(joinedAdDates); // adDates를 DTO에 설정

	        // 결과 리스트에 추가
	        resultList.add(dto);
	    }

	    return resultList; // 최종 결과 리스트 반환
	}


	// 비회원 관리 > 신청폼 > 가입 승인여부 True and 기수 등록 and 
	public void nonMemberApprove(int joId) {
		ClubNum clubNum = clubNunRepo.findFirstByOrderByClubNumIdDesc();
		
		JoinClub jc = joinRepo.findById(joId).get();
		jc.setClubNumId(clubNum);//기수 등록
		jc.setApp(true);//승인

		joinRepo.save(jc);
	}
	
	// 비회원 관리 > 신청폼 > 반려
	public void nonMemberDisApprove(int joId) {
		JoinClub jc = joinRepo.findById(joId).get();
		jc.setClubNumId(null);
		jc.setApp(false);//반려
		
		joinRepo.save(jc);
	}

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
		MemberTier memberTier = tiRepo.findByMemTier(member.getMemberTier().getMemTier());
		mem.setMemberTier(memberTier);
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
		Map<String, Object> adminTypeMap = (Map<String, Object>) updateFields.get("adminType");
		String adminTypeName = (String) adminTypeMap.get("adminTypeName");
		updateTypeByAdminId(adminId, adminTypeName);

		Map<String, Object> memberMap = (Map<String, Object>) updateFields.get("member");
		Member member = new Member();
		Integer memClubNum = Integer.parseInt(memberMap.get("memClubNum").toString());
		member.setMemClubNum(memClubNum);
		
		Map<String, Object> memberTierMap = (Map<String, Object>) memberMap.get("memberTier");
		String memTier = (String) memberTierMap.get("memTier");
		MemberTier memberTier = tiRepo.findByMemTier(memTier);

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
		MemberTier memberTier = tiRepo.findByMemTier(member.getMemberTier().getMemTier());
		mem.setMemberTier(memberTier);
		mRepo.save(mem);
	}
	
	//공지사항관리 > 전체조회
	public List<NoticeDTO> getNoticeAll() {
		List<Notice> list = nRepo.findAll();
		return nMapper.toDtoList(list);
	}
	
	//공지사항관리 > 제목으로 해당 추가된 내용 수정 또는 조회 기능
	public NoticeDTO getNotId(Long notId) throws Exception{
		Notice JoinClub = nRepo.findByNotId(notId);
		NoticeDTO dto = nMapper.toDto(JoinClub);
		return dto;
	}
	
	//공지사항관리 > 추가 > 등록
	public void noticeAdd(NoticeDTO noticeDTO) {
	    LocalDate today = LocalDate.now(); // 예: 2024-09-29
	    LocalDateTime todayDateTime = today.atStartOfDay(); // 시간은 00:00:00으로 설정
	    Timestamp timestamp = Timestamp.valueOf(todayDateTime);
	    NoticeTag tag = ntRepo.findByNotTagId(noticeDTO.getTag().getNotTagId());
	    
	    Notice not = new Notice();
	    not.setContent(noticeDTO.getContent());
	    not.setTitle(noticeDTO.getTitle());
	    not.setTag(tag);
	    not.setCreAt(timestamp);
	    not.setViews(Long.valueOf(0));
        Admin admin = aRepo.findByAdminId(getUser().getUsername()); // 생성자
        
        if (admin != null) { // null 체크
        	not.setAdminId(admin.getAdminId());
        } else {
            throw new RuntimeException("Admin not found");
        }
        
        nRepo.save(not);
	}

	//공지사항관리 > 태그 > 전체조회
	public List<NoticeTagDTO> getNoticeTagAll() {
		List<NoticeTag> list = ntRepo.findAllByOrderByOrderAsc();
		return ntMapper.toDtoList(list);
	}
	
	//공지사항관리 > 태그 > 등록
	public void noticeTagInsert(String notTagName) {
	    LocalDate today = LocalDate.now(); // 예: 2024-09-29
	    LocalDateTime todayDateTime = today.atStartOfDay(); // 시간은 00:00:00으로 설정
	    Timestamp timestamp = Timestamp.valueOf(todayDateTime);
	    
	    // 기존 태그 조회
	    NoticeTag tag = ntRepo.findByNotTagName(notTagName);
	    
	    // 태그가 존재하지 않는 경우
	    if (tag == null) { // 존재하지 않음 -> 새로 생성
	        tag = new NoticeTag(); // 여기서 객체를 초기화
	        tag.setNotTagName(notTagName);
	        tag.setCreAt(timestamp);
	        tag.setOrder(ntRepo.findMaxOrder()+1);
	        Admin admin = aRepo.findByAdminId(getUser().getUsername()); // 생성자
	        
	        if (admin != null) { // null 체크
	            tag.setCreAdmin(admin);
	        } else {
	            throw new RuntimeException("Admin not found");
	        }
	        
	        ntRepo.save(tag);
	    } else { // 태그가 존재하는 경우
	        tag.setNotTagName(notTagName);
	        Admin admin = aRepo.findByAdminId(getUser().getUsername()); // 수정자
	       
	        if (admin != null) { // null 체크
	            tag.setUptAdmin(admin);
	        } else {
	            throw new RuntimeException("Admin not found");
	        }
	        
	        ntRepo.save(tag);
	    }
	}
	
	//공지사항관리 > 태그 > 수정
	public void updateByNotTagId(Long notTagId,NoticeTagDTO noticeTagDTO) {
		NoticeTag tag = ntRepo.findByNotTagId(notTagId);
		tag.setNotTagName(noticeTagDTO.getNotTagName());
        Admin admin = aRepo.findByAdminId(getUser().getUsername()); // 수정자
        
        if (admin != null) { // null 체크
            tag.setUptAdmin(admin);
        } else {
            throw new RuntimeException("Admin not found");
        }
        
        ntRepo.save(tag);
	}
	
	//공지사항관리 > 태그 > 순서수정
	public void updateOrder(List<NoticeTagDTO> noticeTagDTOList) {
		for (NoticeTagDTO noticeTagDTO : noticeTagDTOList) {
			NoticeTag entity = ntRepo.findByNotTagId(noticeTagDTO.getNotTagId());
			entity.setOrder(noticeTagDTO.getOrder());
			ntRepo.save(entity);
		}
	}
	
	//공지사항관리 > 태그 > 삭제
	public void deleteByNotTagId(Long notTagId) {
		ntRepo.deleteById(notTagId);
    }
	
	//회비관리 > 전체조회
	public List<MemberShipFeeDTO> getMemberShipFeeAllByCreAt(String currentMonth) {
        // currentMonth 예시: "2024-09"

        // 날짜 포맷터 설정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");

        // currentMonth를 LocalDateTime으로 변환
        LocalDateTime startDate = LocalDateTime.parse(currentMonth + "-01T00:00:00"); // 시작 날짜
        LocalDateTime endDate = startDate.plusMonths(1); // 다음 달의 시작 날짜로 설정

        // endDate에서 하루를 빼서 그 달의 마지막 날을 설정
        endDate = endDate.minusNanos(1); // 2024-09-30 23:59:59.999999999로 설정
        /*LocalDateTime startDate = LocalDateTime.parse(currentMonth + "-01T00:00:00"); // 2024-09-01 00:00:00
        LocalDateTime endDate = LocalDateTime.parse(currentMonth + "-30T23:59:59");*/
        // 데이터 조회
        List<MemberShipFee> list = fRepo.findByCreAtBetween(startDate, endDate);
        return fMapper.toDtoList(list);
    }
	
	//회비관리 > 회비 정보 수정
	public void updateFeeInfo(Long feeId,MemberShipFeeDTO fee) {
		MemberShipFee mfee = fRepo.findByFeeId(feeId);
		mfee.setMonthlyFee(fee.getMonthlyFee());
		mfee.setPayMethod(fee.getPayMethod());
		mfee.setAmount(fee.getAmount());
		mfee.setIsPaid(fee.getIsPaid());
		mfee.setPayDate(fee.getPayDate());
		mfee.setRemarks(fee.getRemarks());
		mfee.setUptAt(LocalDateTime.now());
		Admin admin = aRepo.findByAdminId(getUser().getUsername());//수정자
		mfee.setAdmin(admin);
		fRepo.save(mfee);
	}
	
	//회비세부사항관리 > 전체조회
	public List<FeeDetailDTO> getFeeDetailAll() {
		List<FeeDetail> list = fdRepo.findAll();
		return fdMapper.toDtoList(list);
	}
	
	//회비세부사항관리 > 등록
	public void insertFeeDetailInfo(FeeDetailDTO feeDatail) {
	    LocalDate today = LocalDate.now(); // 예: 2024-09-29
	    
    	FeeDetail fee = new FeeDetail();
    	fee.setContent(feeDatail.getContent());
    	fee.setDdate(feeDatail.getDdate());
    	fee.setExpend(feeDatail.getExpend());
    	fee.setIncome(feeDatail.getIncome());
    	fee.setTotalMoney(feeDatail.getTotalMoney());
        
        fee.setCreAdmin(getUser().getUsername());
        fee.setCreDate(today);
        fee.setUptAdmin(getUser().getUsername());
        fee.setUptDate(today);
        
        fdRepo.save(fee);
    
	}
	
	//회비세부사항관리 > 수정
	public void feeDetailInfo(Long feeDetailId, FeeDetailDTO feeDatail) {
	    LocalDate today = LocalDate.now(); // 예: 2024-09-29
	    
	    FeeDetail fee = fdRepo.findByFeeDetailId(feeDatail.getFeeDetailId());
	    fee.setContent(feeDatail.getContent());
		fee.setDdate(feeDatail.getDdate());
		fee.setExpend(feeDatail.getExpend());
		fee.setIncome(feeDatail.getIncome());
		fee.setTotalMoney(feeDatail.getTotalMoney());
	   
	    fee.setCreAdmin(getUser().getUsername());
	    fee.setUptAdmin(getUser().getUsername());
	    fee.setUptDate(today);
	    
	    fdRepo.save(fee);
	}
	
	//출석관리 > 회원출석 정보 수정
	public void updateAttInfo(List<AttendanceDTO> attendanceDataList) {
	    LocalDate today = LocalDate.now(); // 예: 2024-09-29
	    LocalDateTime todayDateTime = today.atStartOfDay(); // 시간은 00:00:00으로 설정
	    Timestamp timestamp = Timestamp.valueOf(todayDateTime);
	    
	    for (AttendanceDTO attendanceData : attendanceDataList) {
	    	Member m = mRepo.findAllByMemId(attendanceData.getMember().getMemId());
	        Attendance att = attRepo.findByAttAtAndMember(attendanceData.getAttAt(), m);
	        
	        if (att == null) {
	            // 존재하지 않으면 새로 생성하여 insert 합니다.
	            att = new Attendance();
	            att.setAttAt(attendanceData.getAttAt());
	            att.setMember(m);
	            att.setAttState(attendanceData.getAttState());
	            att.setCreAt(timestamp);
	            try {
	                attRepo.save(att);
	                logger.info(attendanceData.getMember().getMemId() + "님의 " + attendanceData.getAttAt() + " " + attendanceData.getAttState() + " 출석 정보가 추가되었습니다.");
	            } catch (Exception e) {
	                System.err.println("Error saving Attendance: " + e.getMessage());
	            }
	        } else {
	            // 존재하면 기존 객체를 업데이트합니다.
	            att.setAttState(attendanceData.getAttState());
	            att.setUptAt(timestamp);
	            Admin admin = aRepo.findByAdminId(getUser().getUsername());//수정자
	            att.setAdmin(admin);
	            attRepo.save(att);

	            logger.info(attendanceData.getMember().getMemId() + "님의 " + attendanceData.getAttAt() + " " + attendanceData.getAttState() + " 출석 정보가 업데이트되었습니다.");
	        }
	    }
	}
	
	//출석관리 > 해당월 전체조회
	public List<Attendance> getAttendanceByMonth(int year, int month) {
        // 특정 월의 시작일과 종료일 계산
		LocalDate startDate = LocalDate.of(year, month, 1);
	    LocalDate endDate = startDate.plusMonths(1).minusDays(1); // 해당 월의 마지막 날
        
        return attRepo.findAllByAttAtBetween(startDate, endDate);
    }

}
