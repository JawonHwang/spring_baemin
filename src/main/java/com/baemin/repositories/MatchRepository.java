package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {

}
