package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.FeeDetail;

public interface FeeDetailRepository extends JpaRepository<FeeDetail, Long> {

}
