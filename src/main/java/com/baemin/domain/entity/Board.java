package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOARDS")
public class Board {

	@Id
	@Column(name = "BOARD_ID")
	private Long boardId;

	@Column(name = "BOARD_TITLE")
	private String boardTitle;

	@Column(name = "BOARD_WRITER")
	private String boardWriter;

	@Column(name = "BOARD_CONTENTS")
	private String boardContents;

	@Column(name = "BOARD_WRITE_DATE")
	private Timestamp boardWriteDate;

	@Column(name = "BOARD_VIEW_COUNT")
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

	public Board(Long boardId, String boardTitle, String boardWriter, String boardContents, Timestamp boardWriteDate,
			Long boardViewCount) {
		super();
		this.boardId = boardId;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardContents = boardContents;
		this.boardWriteDate = boardWriteDate;
		this.boardViewCount = boardViewCount;
	}

	public Board() {
		super();
	}

}
