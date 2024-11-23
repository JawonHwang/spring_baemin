package com.baemin.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.VisitorDTO;
import com.baemin.services.SataticService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/visit")
public class VisitorController {
	private static final Logger logger = LoggerFactory.getLogger(VisitorController.class);
	
	@Autowired
	private SataticService vServ;
	
	//방문자수
	@GetMapping("/visitor")
	public ResponseEntity<Void> getTodayVisitor(HttpServletRequest request, HttpServletResponse response) {
		try {
			HttpSession session = request.getSession(true);
			String sessionId = session.getId();

			Cookie[] cookies = request.getCookies();
			boolean visited = false;

			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("visited") && cookie.getValue().equals(sessionId)) {
						visited = true;
						break;
					}
				}
			}

			VisitorDTO dto = vServ.getTodayVisitor();

			if (dto == null) {
				// 오늘 방문자 데이터가 없는 경우
				if (!visited) {
					// 클라이언트가 처음 접속한 경우
					Cookie visitedCookie = new Cookie("visited", sessionId);
					visitedCookie.setMaxAge(24 * 60 * 60); // 쿠키 유효기간 설정 (24시간)
					visitedCookie.setHttpOnly(true);
					response.addCookie(visitedCookie);
					vServ.createVisitor();
					visitedCookie.setSecure(true);
				}
			} else {
				// 오늘 방문자 데이터가 있는 경우
				if (!visited) {
					// 클라이언트가 처음 접속한 경우
					Cookie visitedCookie = new Cookie("visited", sessionId);
					visitedCookie.setMaxAge(24 * 60 * 60); // 쿠키 유효기간 설정 (24시간)
					visitedCookie.setHttpOnly(true);//XSS로부터 보호
					response.addCookie(visitedCookie);
					vServ.incrementVisitor(dto.getSeq());
					visitedCookie.setSecure(true);// HTTPS 프로토콜에서만
				}
			}

			return ResponseEntity.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
