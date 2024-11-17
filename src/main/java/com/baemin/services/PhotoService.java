package com.baemin.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baemin.domain.entity.Photo;
import com.baemin.dto.PhotoDTO;
import com.baemin.mappers.PhotoMapper;
import com.baemin.repositories.PhotoRepository;

@Service
public class PhotoService {

	private static final Logger logger = LoggerFactory.getLogger(PhotoService.class);

	@Autowired
	private PhotoRepository pRepo;

	@Autowired
	private PhotoMapper pMapper;

	public Photo insertPhoto(PhotoDTO dto) {
		Photo ab = pMapper.toEntity(dto);
		return pRepo.save(ab); // 저장 후 엔티티 반환
	}

	public void updatePhoto(Long photoId, String photoTitle, String photoContents) {
		// 기존 게시물 조회
		Photo b = pRepo.findById(photoId).get();
		// 새로운 값으로 기존 게시물의 필드 업데이트
		b.setPhotoTitle(photoTitle);
		b.setPhotoContents(photoContents);

		// 수정된 게시물 저장
		pRepo.save(b);
	}

	public List<PhotoDTO> selectAll() {
		List<Photo> list = pRepo.findAll();
		List<PhotoDTO> dtos = pMapper.toDtoList(list);
		return dtos;
	}

	public PhotoDTO getContents(Long photoId) throws Exception {
		Photo Photo = pRepo.findById(photoId).get();
		PhotoDTO dto = pMapper.toDto(Photo);
		return dto;
	}

	public void deletePost(Long photoId) throws Exception {
		Photo Photo = pRepo.findById(photoId).get();
		// Post Delete
		pRepo.delete(Photo);
	}

}
