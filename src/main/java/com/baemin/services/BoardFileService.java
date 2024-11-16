package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.BoardFile;
import com.baemin.dto.BoardFileDTO;
import com.baemin.mappers.BoardFileMapper;
import com.baemin.repositories.BoardFileRepository;

@Service
public class BoardFileService {

	private static final Logger logger = LoggerFactory.getLogger(BoardFileService.class);

	@Autowired
	private BoardFileRepository bRepo;

	@Autowired
	private BoardFileMapper bMapper;

	public List<BoardFileDTO> selectByParentId(Long boardId) {
		List<BoardFile> list = bRepo.findByBoardFileParentId(boardId);
		List<BoardFileDTO> dtos = bMapper.toDtoList(list);
		return dtos;
	}

	public void insert(BoardFileDTO dto) throws Exception {
		BoardFile f = bMapper.toEntity(dto);
		bRepo.save(f);
	}
	
	public void update(BoardFileDTO dto) throws Exception {
		long boardFileId = dto.getBoardFileId();
		BoardFile bf = bRepo.findByBoardFileId(boardFileId);
		bRepo.delete(bf);
		BoardFile f = bMapper.toEntity(dto);
		bRepo.save(f);
	}

}
