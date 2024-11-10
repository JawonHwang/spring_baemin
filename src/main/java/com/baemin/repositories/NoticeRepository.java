package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
	Notice findByNotId(Long notId);
}
