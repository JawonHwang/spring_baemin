package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.controllers.BoardController;
import com.baemin.domain.entity.Board;
import com.baemin.dto.BoardDTO;
import com.baemin.mappers.BoardMapper;
import com.baemin.repositories.BoardRepository;

@Service
public class BoardService {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardRepository bRepo;
	
	@Autowired
	private BoardMapper bMapper;
	
	public void insertBoard(BoardDTO dto) {
		Board ab = bMapper.toEntity(dto);
		bRepo.save(ab);
	}
	
	public List<BoardDTO> selectAll(){
		List<Board> list = bRepo.findAll();
		List<BoardDTO> dtos = bMapper.toDtoList(list);
		return dtos;
	}

	public BoardDTO getContents(Long boardId) throws Exception{
		Board Board = bRepo.findById(boardId).get();
		BoardDTO dto = bMapper.toDto(Board);
		return dto;
	}
	
	public void deletePost(Long boardId) throws Exception{
		Board Board = bRepo.findById(boardId).get();
		//Post Delete
		bRepo.delete(Board);	
	}
	
}
