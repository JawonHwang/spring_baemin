package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
