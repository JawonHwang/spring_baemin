package com.baemin.services;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.Member;
import com.baemin.domain.entity.MemberShipFee;
import com.baemin.mappers.MemberMapper;
import com.baemin.mappers.MemberShipFeeMapper;
import com.baemin.repositories.MemberRepository;
import com.baemin.repositories.MemberShipFeeRepository;

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
	
	
	// 회비관리 > 전체 회원에 대한 매달 데이터 생성
	@Scheduled(cron = "0 0 0 1 * ?") // 매달 1일 00:00에 실행
	public void generateMonthlyData() {
		logger.info("회비 회원 월 데이터 생성했습니다.");
		List<Member> members = mRepo.findAll();
		for (Member member : members) {
			MemberShipFee fee = new MemberShipFee();
			fee.setMonthlyFee(10000L); //TODO : 김승엽
			fee.setCreAt(LocalDateTime.now());
			fee.setMember(member);
			fRepo.save(fee);
		}
	}

}
