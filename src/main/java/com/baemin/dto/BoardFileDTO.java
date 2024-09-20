package com.baemin.dto;

public class BoardFileDTO {

	private Long boardFileId;
	private Long boardFileParentId;
	private String boardFileOriName;
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

	public BoardFileDTO(Long boardFileId, Long boardFileParentId, String boardFileOriName, String boardFileSysName) {
		super();
		this.boardFileId = boardFileId;
		this.boardFileParentId = boardFileParentId;
		this.boardFileOriName = boardFileOriName;
		this.boardFileSysName = boardFileSysName;
	}

	public BoardFileDTO() {
		super();
	}

}
