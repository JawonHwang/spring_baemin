package com.baemin.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.BoardFileDTO;
import com.baemin.services.BoardFileService;

@RestController
@RequestMapping("/api/boardFile")
public class BoardFileController {
	@Autowired
	BoardFileService fservice;

	@GetMapping("/{boardId}")
	public ResponseEntity<List<BoardFileDTO>> selectById(@PathVariable Long boardId) {
		List<BoardFileDTO> files = fservice.selectByParentId(boardId);
		return ResponseEntity.ok(files);
	}

	@GetMapping("/download/{sys_name}")
	public ResponseEntity<Resource> download(@PathVariable String sys_name) {
		String filePath = "C:/uploads/" + sys_name;

		byte[] fileContent;
		try (InputStream inputStream = new FileInputStream(new File(filePath))) {
			fileContent = inputStream.readAllBytes();
		} catch (IOException e) {
			return ResponseEntity.notFound().build();
		}

		ByteArrayResource resource = new ByteArrayResource(fileContent);

		return ResponseEntity.ok()
				.contentType(org.springframework.http.MediaType.APPLICATION_OCTET_STREAM)
				.contentLength(fileContent.length)
				.body(resource);

	}

}

