package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.PhotoFile;

public interface PhotoFileRepository extends JpaRepository<PhotoFile, Long>{

}
