package com.baemin.controllers;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.BoardDTO;
import com.baemin.dto.CalendarDTO;
import com.baemin.dto.CalendarTypeDTO;
import com.baemin.services.CalendarService;

@RestController
@RequestMapping("/api/calendar")
public class CalendarController {

	@Autowired
	private CalendarService cService;

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody CalendarDTO dto) throws Exception {
		CalendarDTO dtos = new CalendarDTO();
		dtos.setCalId(0L);
		dtos.setCalMemId(dto.getCalMemId());
		dtos.setCalTitle(dto.getCalTitle());
		dtos.setCalContents(dto.getCalContents());
		dtos.setCalStartTime(dto.getCalStartTime());
		dtos.setCalEndTime(dto.getCalEndTime());
		dtos.setCalWriteDate(Timestamp.from(Instant.now()));
		dtos.setCalTypeId(dto.getCalTypeId());
		cService.insert(dtos);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<CalendarDTO>> selectAll() {
		List<CalendarDTO> list = cService.selectAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/type")
	public ResponseEntity<List<CalendarTypeDTO>> getType() {
		List<CalendarTypeDTO> list = cService.getType();
		return ResponseEntity.ok(list);
	}

	@DeleteMapping("/{calId}")
	public ResponseEntity<String> delete(@PathVariable Long calId) throws Exception {
		cService.delete(calId);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{calId}")
	public ResponseEntity<Void> update(@PathVariable Long calId, @RequestBody CalendarDTO dto) throws Exception {
		cService.update(calId, dto);
		return ResponseEntity.ok().build();
	}
}
