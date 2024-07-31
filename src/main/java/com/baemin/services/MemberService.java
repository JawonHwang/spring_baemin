package com.baemin.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.baemin.controllers.MemberController;
import com.baemin.mappers.MemberMapper;
import com.baemin.repositories.MemberRepository;

@Service
public class MemberService {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberRepository mRepo;
	
	@Autowired
	private MemberMapper mMapper;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
}
