package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.controllers.AdminController;
import com.baemin.domain.entity.Admin;
import com.baemin.dto.AdminDTO;
import com.baemin.mappers.AdminMapper;
import com.baemin.repositories.AdminRepository;

@Service
public class AdminService {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private AdminRepository aRepo;
	
	@Autowired
	private AdminMapper aMapper;
	
	//관리자 관리
	public List<AdminDTO> getAdminAll() {
		List<Admin> list = aRepo.findAll();
		List<AdminDTO> dtos = aMapper.toDtoList(list);
		return dtos;
	}
}
