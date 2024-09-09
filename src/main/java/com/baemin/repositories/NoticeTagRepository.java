package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.NoticeTag;

public interface NoticeTagRepository extends JpaRepository<NoticeTag, Long> {

}
