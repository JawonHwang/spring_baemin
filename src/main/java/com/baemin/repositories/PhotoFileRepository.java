package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.PhotoFile;

public interface PhotoFileRepository extends JpaRepository<PhotoFile, Long> {

	List<PhotoFile> findByPhotoFileParentId(Long photoId);

	PhotoFile findByPhotoFileId(Long photoFileId);

}
