package com.baemin.controllers;

import java.io.File;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.baemin.domain.entity.Photo;
import com.baemin.dto.PhotoDTO;
import com.baemin.dto.PhotoFileDTO;
import com.baemin.services.MemberService;
import com.baemin.services.PhotoFileService;
import com.baemin.services.PhotoService;

@RestController
@RequestMapping("/api/photo")
public class PhotoController {

	@Autowired
	private PhotoService pService;

	@Autowired
	private PhotoFileService fService;

	@Autowired
	private MemberService mService;

	// Photo insert
	@PostMapping
	public ResponseEntity<Void> insertPhoto(@RequestParam String photoTitle, @RequestParam String photoWriter,
			@RequestParam(required = false) MultipartFile[] files, @RequestParam String photoContents)
			throws Exception {
		PhotoDTO dto = new PhotoDTO();
		dto.setPhotoId(0L);
		dto.setPhotoTitle(photoTitle);
		dto.setPhotoWriter(photoWriter);
		dto.setPhotoContents(photoContents);
		dto.setPhotoViewCount(0L);
		dto.setPhotoWriteDate(Timestamp.from(Instant.now()));

		// 생성된 Photo 엔티티를 받아옴
		Photo photo = pService.insertPhoto(dto);
		long photoParentId = photo.getPhotoId(); // 생성된 photoId 가져오기

		String upload = "C:/uploads/photo";
		File uploadPath = new File(upload);

		if (!uploadPath.exists()) {
			uploadPath.mkdirs();
		}

		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				String oriName = file.getOriginalFilename();
				String sysName = UUID.randomUUID() + "_" + oriName;

				file.transferTo(new File(uploadPath, sysName));

				PhotoFileDTO fdto = new PhotoFileDTO();
				fdto.setPhotoFileId(0L);
				fdto.setPhotoFileOriName(oriName);
				fdto.setPhotoFileSysName(sysName);
				fdto.setPhotoFileParentId(photoParentId); // 게시물의 id를 parentid로 설정
				fService.insert(fdto);
			}
		}

		return ResponseEntity.ok().build();
	}

	// Photo 리스트
	@GetMapping
	public ResponseEntity<List<PhotoDTO>> selectAll() {
		List<PhotoDTO> list = pService.selectAll();
		return ResponseEntity.ok(list);
	}

	// Detail 로
	@GetMapping("/contents/{photoId}")
	public ResponseEntity<PhotoDTO> getContents(@PathVariable Long photoId) throws Exception {
		PhotoDTO dto = pService.getContents(photoId);
		
		pService.incrementViewCount(photoId);
		
		return ResponseEntity.ok(dto);
	}

	// 게시물 삭제
	@DeleteMapping("/delete/{photoId}")
	public ResponseEntity<String> deletePost(@PathVariable Long photoId) throws Exception {
		pService.deletePost(photoId);
		return ResponseEntity.ok().build();
	}

	// 게시물 수정
	@PutMapping("/update/{photoId}")
	public ResponseEntity<Void> updatePhoto(@PathVariable Long photoId, @RequestParam String photoTitle,
			@RequestParam(required = false) MultipartFile[] files, @RequestParam String photoContents)
			throws Exception {

		pService.updatePhoto(photoId, photoTitle, photoContents);

		String upload = "C:/uploads/photo";
		File uploadPath = new File(upload);

		if (!uploadPath.exists()) {
			uploadPath.mkdirs();
		}

		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				String oriName = file.getOriginalFilename();
				String sysName = UUID.randomUUID() + "_" + oriName;

				file.transferTo(new File(uploadPath, sysName));

				PhotoFileDTO fdto = new PhotoFileDTO();
				fdto.setPhotoFileId(0L);
				fdto.setPhotoFileOriName(oriName);
				fdto.setPhotoFileSysName(sysName);
				fdto.setPhotoFileParentId(photoId);
				fService.update(fdto);
			}
		}

		return ResponseEntity.ok().build();
	}

}