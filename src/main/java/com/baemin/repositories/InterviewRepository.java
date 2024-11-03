package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {
	Interview findByIvId(int ivId);
}
