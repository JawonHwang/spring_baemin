package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

}
