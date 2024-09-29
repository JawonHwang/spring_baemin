package com.baemin.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.MemberShipFee;

public interface MemberShipFeeRepository extends JpaRepository<MemberShipFee, Long> {
	 List<MemberShipFee> findByCreAtBetween(LocalDateTime startDate, LocalDateTime endDate);
	 MemberShipFee findByFeeId(Long feeId);
}