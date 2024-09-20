package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.PayMethod;

public interface PayMethodRepository extends JpaRepository<PayMethod, Long> {

}
