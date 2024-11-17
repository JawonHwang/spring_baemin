package com.baemin.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baemin.dto.CalendarDTO;
import com.baemin.services.CalendarService;

@RestController
@RequestMapping("/api/calendar")
public class CalendarController {

	@Autowired
	private CalendarService cService;

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody CalendarDTO dto) throws Exception {
		cService.insert(dto);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<CalendarDTO>> selectAll() {
		List<CalendarDTO> list = cService.selectAll();
		return ResponseEntity.ok(list);
	}

	@DeleteMapping("/{calId}")
	public ResponseEntity<String> delete(@PathVariable Long calId) throws Exception {
		cService.delete(calId);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{calId}")
	public ResponseEntity<Void> update(@PathVariable Long calId, @RequestParam String boardTitle)
			throws Exception {

		cService.update(calId, boardTitle);

		return ResponseEntity.ok().build();
	}
}
