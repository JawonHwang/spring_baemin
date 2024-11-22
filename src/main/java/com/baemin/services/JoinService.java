package com.baemin.services;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baemin.controllers.JoinController;
import com.baemin.domain.entity.ActivityDate;
import com.baemin.domain.entity.Interview;
import com.baemin.domain.entity.JoinClub;
import com.baemin.domain.entity.Member;
import com.baemin.dto.ActivityDateDTO;
import com.baemin.dto.InterviewDTO;
import com.baemin.dto.JoinClubDTO;
import com.baemin.mappers.ActivityDateMapper;
import com.baemin.mappers.InterviewMapper;
import com.baemin.mappers.JoinClubMapper;
import com.baemin.repositories.ActivityDateRepository;
import com.baemin.repositories.InterviewRepository;
import com.baemin.repositories.JoinClubRepository;

@Service
public class JoinService {

	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);

	@Autowired
	private JoinClubRepository jRepo;

	@Autowired
	private InterviewRepository iRepo;

	@Autowired
	private ActivityDateRepository aRepo;

	@Autowired
	private JoinClubMapper jMapper;

	@Autowired
	private InterviewMapper iMapper;

	@Autowired
	private ActivityDateMapper aMapper;

	public void joinClub(JoinClubDTO dto) throws Exception {
		dto.setJoApprDate(Timestamp.from(Instant.now()));
		// dto.setMemTierId(6); 찬양 - 에러나서 주석 아래 --부분 코드 수정 나중에 주석 지워줘

		JoinClub j = jMapper.toEntity(dto);
		jRepo.save(j);
	}

	/*
	 * @Transactional TODO : INSERT문인데 나중에 데이터 제 1정규화 적용시키기 public void
	 * joinClub(JoinClubDTO dto) throws Exception { // 1. activityIds를 String 리스트로
	 * 변환 List<String> activityIds = Arrays.stream(dto.getJoAdIds().split(","))
	 * .map(String::trim) .collect(Collectors.toList());
	 * System.out.println(activityIds);
	 * 
	 * // 2. interviewIds를 String 리스트로 변환 List<String> interviewIds =
	 * Arrays.stream(dto.getJoIvIds().split(",")) .map(String::trim)
	 * .collect(Collectors.toList()); System.out.println(interviewIds);
	 * 
	 * // 활동 가능 날짜 ID 저장 for (String activityId : activityIds) {
	 * System.out.println(activityId); JoinClub joinClub = new JoinClub();
	 * joinClub.setJoAdIds(activityId); // String으로 설정 joinClub.setJoIvIds(null);
	 * joinClub.setJoApprDate(Timestamp.from(Instant.now()));
	 * joinClub.setJoContact(dto.getJoContact());
	 * joinClub.setJoDept(dto.getJoDept()); joinClub.setJoGender(dto.getJoGender());
	 * joinClub.setJoName(dto.getJoName()); joinClub.setJoSkill(dto.getJoSkill());
	 * joinClub.setJoSkill(dto.getJoSkill()); joinClub.setJoStuId(dto.getJoStuId());
	 * 
	 * jRepo.save(joinClub); }
	 * 
	 * // 면접 가능 날짜 ID 저장 for (String interviewId : interviewIds) {
	 * System.out.println(interviewId); JoinClub joinClub = new JoinClub();
	 * joinClub.setJoAdIds(null); joinClub.setJoIvIds(interviewId); // String으로 설정
	 * joinClub.setJoApprDate(Timestamp.from(Instant.now()));
	 * joinClub.setJoContact(dto.getJoContact());
	 * joinClub.setJoDept(dto.getJoDept()); joinClub.setJoGender(dto.getJoGender());
	 * joinClub.setJoName(dto.getJoName()); joinClub.setJoSkill(dto.getJoSkill());
	 * joinClub.setJoStuId(dto.getJoStuId()); jRepo.save(joinClub); } }
	 */

	public List<ActivityDateDTO> selectDateAll() {
		List<ActivityDate> list = aRepo.findAll();
		List<ActivityDateDTO> dtos = aMapper.toDtoList(list);
		return dtos;
	}

	public List<InterviewDTO> selectInterAll() {
		List<Interview> list = iRepo.findAll();
		List<InterviewDTO> dtos = iMapper.toDtoList(list);
		return dtos;
	}

	public JoinClubDTO getJoStuId(int joId) throws Exception {
		JoinClub JoinClub = jRepo.findById(joId).get();
		JoinClubDTO dto = jMapper.toDto(JoinClub);
		return dto;
	}


	// 승인된 학번들의 JoStuId 리스트를 반환하는 메서드
	public List<String> getApprovedJoStuIds() {
	    // `JoIsApp == true`인 학번들만 필터링하여 JoStuId 리스트를 반환
	    return jRepo.findByIsApp(true).stream()
	                              .map(JoinClub::getJoStuId) // JoStuId만 추출
	                              .collect(Collectors.toList());
	}

	
}
