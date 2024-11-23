package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.PhotoFile;
import com.baemin.dto.PhotoFileDTO;
import com.baemin.mappers.PhotoFileMapper;
import com.baemin.repositories.PhotoFileRepository;

@Service
public class PhotoFileService {

	private static final Logger logger = LoggerFactory.getLogger(PhotoFileService.class);

	@Autowired
	private PhotoFileRepository pRepo;

	@Autowired
	private PhotoFileMapper pMapper;
	
	public List<PhotoFileDTO> selectAll() {
		List<PhotoFile> list = pRepo.findAll();
		List<PhotoFileDTO> dtos = pMapper.toDtoList(list);
		return dtos;
	}

	public List<PhotoFileDTO> selectByParentId(Long photoId) {
		List<PhotoFile> list = pRepo.findByPhotoFileParentId(photoId);
		List<PhotoFileDTO> dtos = pMapper.toDtoList(list);
		return dtos;
	}

	public void insert(PhotoFileDTO dto) throws Exception {
		PhotoFile f = pMapper.toEntity(dto);
		pRepo.save(f);
	}

	public void update(PhotoFileDTO dto) throws Exception {
		long photoFileId = dto.getPhotoFileId();
		PhotoFile bf = pRepo.findByPhotoFileId(photoFileId);
		pRepo.delete(bf);
		PhotoFile f = pMapper.toEntity(dto);
		pRepo.save(f);
	}

}
