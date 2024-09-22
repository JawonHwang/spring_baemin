package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.MemberTier;

public interface MemberTierRepository extends JpaRepository<MemberTier, Long>{
	MemberTier findByMemTier(String memTier);
}
