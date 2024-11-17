package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.Calendar;
import com.baemin.dto.CalendarDTO;
import com.baemin.mappers.CalendarMapper;
import com.baemin.repositories.CalendarRepository;

@Service
public class CalendarService {

	private static final Logger logger = LoggerFactory.getLogger(CalendarService.class);

	@Autowired
	private CalendarRepository cRepo;

	@Autowired
	private CalendarMapper cMapper;

	public Calendar insert(CalendarDTO dto) {
		Calendar ab = cMapper.toEntity(dto);
		return cRepo.save(ab); // 저장 후 엔티티 반환
	}

	public List<CalendarDTO> selectAll() {
		List<Calendar> list = cRepo.findAll();
		List<CalendarDTO> dtos = cMapper.toDtoList(list);
		return dtos;
	}

	public void delete(Long calId) throws Exception {
		Calendar Calendar = cRepo.findById(calId).get();
		// Post Delete
		cRepo.delete(Calendar);
	}

	public void update(Long calId, String boardTitle) {
		Calendar c = cRepo.findById(calId).get();
		c.setCalTitle(boardTitle);
		cRepo.save(c);
	}
}
