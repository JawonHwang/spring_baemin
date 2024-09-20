package com.baemin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.BoardDTO;
import com.baemin.dto.MemberDTO;
import com.baemin.services.BoardService;
import com.baemin.services.MemberService;

@RestController
@RequestMapping("/api/board")
public class BoardController {

	@Autowired
	private BoardService bService;

	@Autowired
	private MemberService mService;

	// Board insert
	@PostMapping
	public ResponseEntity<Void> insertReport(@RequestParam("") String title) throws Exception{
		BoardDTO dto = new BoardDTO();
		dto.setBoardId(0L);
		dto.setBoardTitle(title);
		
		bService.insertBoard(dto);

		return ResponseEntity.ok().build();
	}	

	// Board 리스트
	@GetMapping
	public ResponseEntity <List<BoardDTO>> selectAll() {
		List<BoardDTO> list = bService.selectAll();
		return ResponseEntity.ok(list);
	}

	// Detail 로
	@GetMapping("/contents/{boardId}")
	public ResponseEntity<BoardDTO> getContents(@PathVariable Long boardId) throws Exception{
		BoardDTO dto = bService.getContents(boardId);
		return ResponseEntity.ok(dto);
	}

	// 게시물 삭제
	@DeleteMapping("/delete/{boardId}")
	public ResponseEntity<String> deletePost(@PathVariable Long boardId) throws Exception{
		bService.deletePost(boardId);	
		return ResponseEntity.ok().build();
	}

}