package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
