package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.MemberShipFee;

public interface MemberShipFeeRepository extends JpaRepository<MemberShipFee, Long> {

}
