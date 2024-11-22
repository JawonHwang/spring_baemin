package com.baemin.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.ActivityDateDTO;
import com.baemin.dto.InterviewDTO;
import com.baemin.dto.JoinClubDTO;
import com.baemin.services.JoinService;

@RestController
@RequestMapping("/api/join")
public class JoinController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private JoinService jServ;

	// 가입신청 등록
	@PostMapping("/club")
	public ResponseEntity<Void> register(@RequestBody JoinClubDTO dto) {
		try {
			jServ.joinClub(dto);
		} catch (Exception e) {
			logger.error(e.getMessage());
			;
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}

	// ActivityDate 리스트
	@GetMapping("/activityDate")
	public ResponseEntity<List<ActivityDateDTO>> selectDateAll() {
		List<ActivityDateDTO> list = jServ.selectDateAll();
		return ResponseEntity.ok(list);
	}

	// Interview 리스트
	@GetMapping("/interview")
	public ResponseEntity<List<InterviewDTO>> selectInterAll() {
		List<InterviewDTO> list = jServ.selectInterAll();
		return ResponseEntity.ok(list);
	}

	// Detail 로
	@GetMapping("/contents/{joId}")
	public ResponseEntity<JoinClubDTO> getJoStuId(@PathVariable int joId) throws Exception {
		JoinClubDTO dto = jServ.getJoStuId(joId);
		return ResponseEntity.ok(dto);
	}

	// 승인된 학번확인
	@GetMapping("/isApp/{memStuId}")
	public ResponseEntity<Boolean> checkJoIsApp(@PathVariable String memStuId) throws Exception {
		// 승인된 학번 리스트 조회
		List<String> approvedJoStuIds = jServ.getApprovedJoStuIds(); // 승인된 학번들의 리스트를 가져오는 메서드 호출

		// 입력받은 MemStuId가 승인된 학번 리스트에 있는지 확인
		boolean isApproved = approvedJoStuIds.contains(memStuId);

		// 결과 반환
		return ResponseEntity.ok(isApproved);
	}

}
