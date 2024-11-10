package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.BoardFile;
import com.baemin.domain.entity.Member;

public interface BoardFileRepository extends JpaRepository<BoardFile, Long>{

	List<BoardFile> findByBoardFileParentId(Long boardId);
	
	BoardFile findByBoardFileId(Long boardFileId);
	
	// 특정 게시물 ID에 연결된 파일 삭제
    void deleteByBoardFileParentId(long boardFileParentId);
}
