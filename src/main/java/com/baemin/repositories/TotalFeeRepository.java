package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.TotalFee;

public interface TotalFeeRepository extends JpaRepository<TotalFee, Long> {

}
