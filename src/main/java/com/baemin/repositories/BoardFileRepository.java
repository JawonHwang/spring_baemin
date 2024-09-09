package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.BoardFile;

public interface BoardFileRepository extends JpaRepository<BoardFile, Long>{

}
