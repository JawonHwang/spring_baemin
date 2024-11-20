package com.baemin.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baemin.domain.entity.NewMember;
import com.baemin.domain.entity.Visitor;
import com.baemin.dto.NewMemberDTO;
import com.baemin.dto.VisitorDTO;
import com.baemin.mappers.MemberMapper;
import com.baemin.mappers.NewMemberMapper;
import com.baemin.mappers.VisitorMapper;
import com.baemin.repositories.MemberRepository;
import com.baemin.repositories.NewMemberRepository;
import com.baemin.repositories.VisitorRepository;

@Service
@Transactional
public class SataticService {
	
	//방문자수 통계
	@Autowired
	private VisitorRepository vRepo;
	@Autowired
	private VisitorMapper vMapper;
	
	//신규 회원 통계
	@Autowired
	private NewMemberRepository nRepo;
	@Autowired
	private NewMemberMapper nMapper;
	
	//회원
	@Autowired
	private MemberRepository mRepo;
	
	@Autowired
	private MemberMapper mMapper;
	
	
	//총 회원수
	public int countMember() {
		return mRepo.countMember();
	}
	
	//방문자수
	public VisitorDTO getTodayVisitor() {
		LocalDate today = LocalDate.now();
		Visitor v =  vRepo.findByVisitorDate(today);
		VisitorDTO dto = vMapper.toDto(v);
		return dto;
	}

	public void createVisitor() {
		Visitor newVisitor = new Visitor();
		newVisitor.setVisitorDate(LocalDate.now());
		newVisitor.setVisitorCount(1);
		vRepo.save(newVisitor);
	}

	public void incrementVisitor(Long seq) {
	    Visitor todayVisitor = vRepo.findById(seq).get();
	    todayVisitor.setVisitorCount(todayVisitor.getVisitorCount() + 1);
	    vRepo.save(todayVisitor);
	}
	public List<VisitorDTO> getAll() {
		List<Visitor> list = vRepo.findAll();
		List<VisitorDTO> dlist = vMapper.toDtoList(list);
		return dlist;
	}
	public int sum() {
		return vRepo.sumVisitorCount();
	}


	public Visitor getDailyVisitors(LocalDate date) {
		return vRepo.findByVisitorDate(date);
	}
	public Visitor getYesterdayVisitors(LocalDate date) {
		return vRepo.findByVisitorDate(date);
	}

	public List<Visitor> getMonthlyVisitors(LocalDate startDate, LocalDate endDate) {
		return vRepo.findByVisitorDateBetween(startDate, endDate);
	}
	
	//신규 회원 통계
	
	public NewMemberDTO getTodayNewMamber() {
		LocalDate today = LocalDate.now();
		NewMember v =  nRepo.findByNewMemberDate(today);
		NewMemberDTO dto = nMapper.toDto(v);
		return dto;
	}
	
	public int sumNM() {
		return nRepo.sumNewMemberCount();
	}

	public void createNewMamber() {
		NewMember newMember = new NewMember();
		newMember.setNewMemberDate(LocalDate.now());
		newMember.setNewMemberCount(Long.valueOf(1));
		nRepo.save(newMember);
	}

	public void incrementNewMember(Long id) {
		NewMember todayNewMember = nRepo.findById(id).get();
		todayNewMember.setNewMemberCount(todayNewMember.getNewMemberCount()+1);
		nRepo.save(todayNewMember);
	}
	public List<NewMemberDTO> getAllNm() {
		List<NewMember> list = nRepo.findAll();
		List<NewMemberDTO> dlist = nMapper.toDtoList(list);
		return dlist;
	}
	public int newMember_sum() {
		return nRepo.sumNewMemberCount();
	}


	public NewMember getDailyNewMember(LocalDate date) {
		return nRepo.findByNewMemberDate(date);
	}
	public NewMember getYesterdayMember(LocalDate date) {
		return nRepo.findByNewMemberDate(date);
	}
}
