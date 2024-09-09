package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
