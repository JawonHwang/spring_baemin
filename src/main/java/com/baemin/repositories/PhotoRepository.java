package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long>{

	Photo findByPhotoId(Long photoId);
	
}
