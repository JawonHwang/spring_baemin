package com.baemin.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.services.JoinService;

@RestController
@RequestMapping("/api/join")
public class JoinController {

private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private JoinService jServ;
}
