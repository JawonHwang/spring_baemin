package com.baemin.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.baemin.controllers.JoinController;
import com.baemin.mappers.ActivityDateMapper;
import com.baemin.mappers.InterviewMapper;
import com.baemin.mappers.JoinClubMapper;
import com.baemin.repositories.ActivityDateRepository;
import com.baemin.repositories.InterviewRepository;
import com.baemin.repositories.JoinClubRepository;

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
	
}
