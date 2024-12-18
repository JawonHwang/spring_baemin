package com.baemin.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.ClubNum;
import com.baemin.domain.entity.Member;
import com.baemin.domain.entity.MemberShipFee;
import com.baemin.domain.entity.TotalFee;
import com.baemin.mappers.ClubNumMapper;
import com.baemin.mappers.MemberMapper;
import com.baemin.mappers.MemberShipFeeMapper;
import com.baemin.repositories.ClubNumRepository;
import com.baemin.repositories.MemberRepository;
import com.baemin.repositories.MemberShipFeeRepository;
import com.baemin.repositories.TotalFeeRepository;

@Service
public class ScheduleService {
private static final Logger logger = LoggerFactory.getLogger(ScheduleService.class);
	
	@Autowired
	private MemberRepository mRepo;
	
	@Autowired
	private MemberMapper mMapper;

	@Autowired
	private MemberShipFeeRepository fRepo;
	
	@Autowired
	private MemberShipFeeMapper fMapper;
	
	@Autowired
	private ClubNumRepository cRepo;
	
	@Autowired
	private ClubNumMapper cMapper;
	
	@Autowired
	private TotalFeeRepository tfRepo;
	
	
	// 회비관리 > 전체 회원에 대한 매달 데이터 생성
	@Scheduled(cron = "0 0 0 1 * ?") // 매달 1일 00:00에 실행
	public void generateMonthlyData() {
		List<Member> members = mRepo.findByIsBan(false);//정지 안된 사람만
		for (Member member : members) {
			MemberShipFee fee = new MemberShipFee();
			TotalFee totalFee = tfRepo.findFirstByOrderByTotalFeeIdDesc();
			fee.setMonthlyFee(totalFee.getPredictFee()); //TODO : 김승엽
			fee.setCreAt(LocalDateTime.now());
			fee.setMember(member);
			fRepo.save(fee);
		}
		logger.info("회비 회원 월 데이터 생성했습니다.");
	}
	
	// 1학기 시작: 매년 2월 20일 오전 9시에 스케줄
	@Scheduled(cron = "0 0 9 20 2 ?")
	public void startSpringSemester() {
		LocalDate today = LocalDate.now();
	    int year = today.getYear()+2;
	    
	    List<ClubNum> allClubNums = cRepo.findAll();
	    
	    int newClubNum = 1; 

	    if (!allClubNums.isEmpty()) {
	        ClubNum lastClubNum = allClubNums.get(allClubNums.size() - 1);
	        newClubNum = lastClubNum.getClubNum() + 1;
	    }

	    ClubNum existingSemester = cRepo.findByStartYearAndSemester(year, 1);
	    if (existingSemester != null) {
	        return; // 이미 1학기가 존재하면 메서드를 종료
	    }
	    // 새로운 ClubNum 객체 생성 및 설정
	    ClubNum clubnum = new ClubNum();
	    clubnum.setClubNum(newClubNum); // 다음 기수 번호
	    clubnum.setStartYear(year); // 현재 연도로 설정
	    clubnum.setSemester(1); // 1학기로 설정
	    clubnum.setCreAt(today);
	    cRepo.save(clubnum);

	    logger.info(year + " 1학기 기수 " + newClubNum + " 생성되었습니다.");
	}

	
    // 2학기 시작: 매년 8월 20일 오전 9시에 스케줄
    @Scheduled(cron = "0 0 9 20 8 ?")
    public void startFallSemester() {
    	LocalDate today = LocalDate.now();
	    int year = today.getYear()+2;
	    
	    List<ClubNum> allClubNums = cRepo.findAll();
	    
	    int newClubNum = 1; 

	    // 만약 기수가 존재하면
	    if (!allClubNums.isEmpty()) {
	        // 마지막 기수를 가져와서 다음 기수 번호를 계산
	        ClubNum lastClubNum = allClubNums.get(allClubNums.size() - 1);
	        newClubNum = lastClubNum.getClubNum() + 1;
	    }

	    // 해당 연도에 2학기가 이미 존재하는지 확인
	    ClubNum existingSemester2 = cRepo.findByStartYearAndSemester(year, 2);
	    if (existingSemester2 != null) {
	        return; // 이미 2학기가 존재하면 메서드를 종료
	    }

	    ClubNum clubnum = new ClubNum();
	    clubnum.setClubNum(newClubNum); // 다음 기수 번호
	    clubnum.setStartYear(year); // 현재 연도로 설정
	    clubnum.setSemester(2); // 2학기로 설정
	    clubnum.setCreAt(today); // 현재 시간으로 설정
	    cRepo.save(clubnum);

	    logger.info(year + " 2학기 기수 " + newClubNum + " 생성되었습니다.");
    }

}
