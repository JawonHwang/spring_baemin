package com.baemin.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.MemberDTO;
import com.baemin.services.MemberService;

@RestController
@RequestMapping("/api/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService mServ;
	
	// 아이디를 기준으로 Member 정보를 뽑아내는
	@GetMapping("/getmem/{loginId}")
	public ResponseEntity<MemberDTO> getMember(@PathVariable String loginId) {
		MemberDTO dto = mServ.findMemberById(loginId);
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping("/{loginId}")
	public ResponseEntity<MemberDTO> selectMember(@PathVariable String loginId) {
		MemberDTO dto = mServ.findMemberById(loginId);
		return ResponseEntity.ok(dto);
	}

	// 이메일로 전송하는
	@PostMapping("/register/{email}")
	public ResponseEntity<String> register(@PathVariable String email) {
		mServ.sendVerificationEmail(email);
		return ResponseEntity.ok("success");
	}

	// 인증번호 확인하는
	@PostMapping("/verify/{code}")
	public ResponseEntity<String> verify(@PathVariable String code) {
		mServ.verifyMember(code);
		if(mServ.verifyMember(code)) {         
			return ResponseEntity.ok("success");
		}
		return ResponseEntity.ok("fail");
	}

	// 임시 비밀번호 전송하는
	@PostMapping("/password")
	public ResponseEntity<String> password(@RequestParam String id, @RequestParam String email) {
		MemberDTO dto = mServ.findMemberById(id);
		mServ.sendTemporaryPasswordEmail(dto.getMemId(),email);
		return ResponseEntity.ok("success");
	}

	// 아이디 찾는
	@PostMapping("/findId")
	public ResponseEntity <List<MemberDTO>> findId(@RequestParam String name, @RequestParam String email) {
		List<MemberDTO> list = mServ.findId(name,email);
		return ResponseEntity.ok(list);
	}

	@PostMapping("/checkID")
	public ResponseEntity<Boolean> checkID(@RequestBody MemberDTO dto) {
		return ResponseEntity.ok(mServ.isDupleID(dto.getMemId()));
	}

	@PostMapping("/register")
	public ResponseEntity<Void> register(@RequestBody MemberDTO dto) {
		System.out.println(dto.getMemId());
		try {
			mServ.register(dto);
		} catch (Exception e) {
			logger.error(e.getMessage());;
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}

	@GetMapping("/isLogined")
	public ResponseEntity<String> isLogined() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication != null && authentication.isAuthenticated() && !authentication.getPrincipal().equals("anonymousUser")) {
			Object principal = authentication.getPrincipal();

			if (principal instanceof UserDetails) {
				return ResponseEntity.ok(((UserDetails) principal).getUsername());
			} else {
				return ResponseEntity.ok(principal.toString()); 
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}
	
//	@PutMapping("/changeID")
//	public ResponseEntity<Void> changeID(@RequestBody String newID) {
//		String userID = "";
//		
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		
//		if (authentication != null && authentication.isAuthenticated() && !authentication.getPrincipal().equals("anonymousUser")) {
//			Object principal = authentication.getPrincipal();
//
//			if (principal instanceof UserDetails) {
//				userID = ((UserDetails) principal).getUsername();
//			} else {
//				userID = principal.toString(); 
//			}
//		}
//		
//		if (userID == "") {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//		}
//		mServ.changeID(userID, newID);
//		return ResponseEntity.ok().build();
//	}
//	
//	@PostMapping("/changePW")
//	public ResponseEntity<Void> changePW(@RequestBody PasswordDTO dto) {
//
//		String userID = "";
//		
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		
//		if (authentication != null && authentication.isAuthenticated() && !authentication.getPrincipal().equals("anonymousUser")) {
//			Object principal = authentication.getPrincipal();
//
//			if (principal instanceof UserDetails) {
//				userID = ((UserDetails) principal).getUsername();
//			} else {
//				userID = principal.toString(); 
//			}
//		}
//		
//		if (userID == "") {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//		}
//		if(!mServ.checkPW(userID, dto.getPassword()))
//			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
//		mServ.changePassword(userID, dto.getNewPassword());
//		return ResponseEntity.ok().build();
//	}

	@PostMapping("/changeUserInfo")
	public ResponseEntity<Void> changeUserInfo(@RequestBody MemberDTO dto) {
		
		String userID = "";
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if (authentication != null && authentication.isAuthenticated() && !authentication.getPrincipal().equals("anonymousUser")) {
			Object principal = authentication.getPrincipal();

			if (principal instanceof UserDetails) {
				userID = ((UserDetails) principal).getUsername();
			} else {
				userID = principal.toString(); 
			}
		}
		
		if (userID == "") {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		mServ.changeUserInfo(userID, dto);
		return ResponseEntity.ok().build();
	}
	
}
