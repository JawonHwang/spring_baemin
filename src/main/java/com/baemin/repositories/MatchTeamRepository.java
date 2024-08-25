package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.MatchTeam;

public interface MatchTeamRepository extends JpaRepository<MatchTeam, Long> {

}
