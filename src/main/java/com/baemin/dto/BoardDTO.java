package com.baemin.dto;

import java.sql.Timestamp;

public class BoardDTO {

	private Long boardId;
	private String boardTitle;
	private String boardWriter;
	private String boardContents;
	private Timestamp boardWriteDate;
	private Long boardViewCount;
	
	public Long getBoardId() {
		return boardId;
	}
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public Timestamp getBoardWriteDate() {
		return boardWriteDate;
	}
	public void setBoardWriteDate(Timestamp boardWriteDate) {
		this.boardWriteDate = boardWriteDate;
	}
	public Long getBoardViewCount() {
		return boardViewCount;
	}

	public void setBoardViewCount(Long boardViewCount) {
		this.boardViewCount = boardViewCount;
	}
	public BoardDTO(Long boardId, String boardTitle, String boardWriter, String boardContents, Timestamp boardWriteDate,
			Long boardViewCount) {
		super();
		this.boardId = boardId;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardContents = boardContents;
		this.boardWriteDate = boardWriteDate;
		this.boardViewCount = boardViewCount;
	}
	public BoardDTO() {
		super();
	}
	
}
