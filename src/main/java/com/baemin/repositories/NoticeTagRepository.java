package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.baemin.domain.entity.NoticeTag;

public interface NoticeTagRepository extends JpaRepository<NoticeTag, Long> {
	NoticeTag findByNotTagName(String notTagName);
	NoticeTag findByNotTagId(Long notTagId);
	List<NoticeTag> findAllByOrderByOrderAsc();
	
	@Query("SELECT MAX(nt.order) FROM NoticeTag nt")
    Integer findMaxOrder();

}
