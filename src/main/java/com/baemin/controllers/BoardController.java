package com.baemin.controllers;

import java.io.File;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

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
import org.springframework.web.multipart.MultipartFile;

import com.baemin.domain.entity.Board;
import com.baemin.dto.BoardDTO;
import com.baemin.dto.BoardFileDTO;
import com.baemin.services.BoardFileService;
import com.baemin.services.BoardService;
import com.baemin.services.MemberService;

@RestController
@RequestMapping("/api/board")
public class BoardController {

	@Autowired
	private BoardService bService;
	
	@Autowired
	private BoardFileService fService;

	@Autowired
	private MemberService mService;

	// Board insert
	@PostMapping
	public ResponseEntity<Void> insertBoard(@RequestParam String boardTitle, @RequestParam String boardWriter, @RequestParam(required = false) MultipartFile[] files, @RequestParam String boardContents) throws Exception{
		BoardDTO dto = new BoardDTO();
		dto.setBoardId(0L);
		dto.setBoardTitle(boardTitle);
		dto.setBoardWriter(boardWriter);
		dto.setBoardContents(boardContents);
		dto.setBoardViewCount(0L);
		dto.setBoardWriteDate(Timestamp.from(Instant.now()));
		
		// 생성된 Board 엔티티를 받아옴
	    Board board = bService.insertBoard(dto);
	    long boardParentId = board.getBoardId(); // 생성된 boardId 가져오기
		
		String upload = "C:/uploads";
		File uploadPath = new File(upload);
		
		if (!uploadPath.exists()) {
			uploadPath.mkdirs();
		}

		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				String oriName = file.getOriginalFilename();
				String sysName = UUID.randomUUID() + "_" + oriName;

				file.transferTo(new File(uploadPath, sysName));

				BoardFileDTO fdto = new BoardFileDTO();
				fdto.setBoardFileId(0L);
				fdto.setBoardFileOriName(oriName);
				fdto.setBoardFileSysName(sysName);
				fdto.setBoardFileParentId(boardParentId); // 게시물의 id를 parentid로 설정
				fService.insert(fdto);
			}
		}

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
	
	// 게시물 수정
	@PutMapping("/update/{boardId}")
	public ResponseEntity<Void> updateBoard(@PathVariable Long boardId, @RequestParam String boardTitle, @RequestParam(required = false) MultipartFile[] files, @RequestParam String boardContents) throws Exception{
	
		bService.updateBoard(boardId,boardTitle,boardContents);
		
		String upload = "C:/uploads";
		File uploadPath = new File(upload);
		
		if (!uploadPath.exists()) {
			uploadPath.mkdirs();
		}

		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				String oriName = file.getOriginalFilename();
				String sysName = UUID.randomUUID() + "_" + oriName;

				file.transferTo(new File(uploadPath, sysName));

				BoardFileDTO fdto = new BoardFileDTO();
				fdto.setBoardFileId(0L);
				fdto.setBoardFileOriName(oriName);
				fdto.setBoardFileSysName(sysName);
				fdto.setBoardFileParentId(boardId);
				fService.update(fdto);
			}
		}

		return ResponseEntity.ok().build();
	}	

}