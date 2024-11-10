package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOARD_FILES")
public class BoardFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOARD_FILE_ID")
	private Long boardFileId;

	@Column(name = "BOARD_FILE_PARENT_ID")
	private Long boardFileParentId;

	@Column(name = "BOARD_FILE_ORI_NAME")
	private String boardFileOriName;

	@Column(name = "BOARD_FILE_SYS_NAME")
	private String boardFileSysName;

	public Long getBoardFileId() {
		return boardFileId;
	}

	public void setBoardFileId(Long boardFileId) {
		this.boardFileId = boardFileId;
	}

	public Long getBoardFileParentId() {
		return boardFileParentId;
	}

	public void setBoardFileParentId(Long boardFileParentId) {
		this.boardFileParentId = boardFileParentId;
	}

	public String getBoardFileOriName() {
		return boardFileOriName;
	}

	public void setBoardFileOriName(String boardFileOriName) {
		this.boardFileOriName = boardFileOriName;
	}

	public String getBoardFileSysName() {
		return boardFileSysName;
	}

	public void setBoardFileSysName(String boardFileSysName) {
		this.boardFileSysName = boardFileSysName;
	}

	public BoardFile(Long boardFileId, Long boardFileParentId, String boardFileOriName, String boardFileSysName) {
		super();
		this.boardFileId = boardFileId;
		this.boardFileParentId = boardFileParentId;
		this.boardFileOriName = boardFileOriName;
		this.boardFileSysName = boardFileSysName;
	}

	public BoardFile() {
		super();
	}

}
