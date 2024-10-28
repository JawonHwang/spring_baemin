package com.baemin.services;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.controllers.JoinController;
import com.baemin.domain.entity.ActivityDate;
import com.baemin.domain.entity.Interview;
import com.baemin.domain.entity.JoinClub;
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
		//dto.setMemTierId(6); 찬양 - 에러나서 주석 아래 --부분 코드 수정 나중에 주석 지워줘
		
		JoinClub j = jMapper.toEntity(dto);
		jRepo.save(j);
	}
	
	public List<ActivityDateDTO> selectDateAll(){
		List<ActivityDate> list = aRepo.findAll();
		List<ActivityDateDTO> dtos = aMapper.toDtoList(list);
		return dtos;
	}
	
	public List<InterviewDTO> selectInterAll(){
		List<Interview> list = iRepo.findAll();
		List<InterviewDTO> dtos = iMapper.toDtoList(list);
		return dtos;
	}

	public JoinClubDTO getJoStuId(Long joId) throws Exception{
		JoinClub JoinClub = jRepo.findById(joId).get();
		JoinClubDTO dto = jMapper.toDto(JoinClub);
		return dto;
	}
	
}
