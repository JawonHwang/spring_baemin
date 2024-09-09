package com.baemin.dto;

import java.sql.Timestamp;

public class PhotoDTO {

	private Long photoId;
	private String photoTitle;
	private String photoWriter;
	private String photoContents;
	private Timestamp photoWriteDate;
	private Long photoViewCount;

	public Long getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}

	public String getPhotoTitle() {
		return photoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
	}

	public String getPhotoWriter() {
		return photoWriter;
	}

	public void setPhotoWriter(String photoWriter) {
		this.photoWriter = photoWriter;
	}

	public String getPhotoContents() {
		return photoContents;
	}

	public void setPhotoContents(String photoContents) {
		this.photoContents = photoContents;
	}

	public Timestamp getPhotoWriteDate() {
		return photoWriteDate;
	}

	public void setPhotoWriteDate(Timestamp photoWriteDate) {
		this.photoWriteDate = photoWriteDate;
	}

	public Long getPhotoViewCount() {
		return photoViewCount;
	}

	public void setPhotoViewCount(Long photoViewCount) {
		this.photoViewCount = photoViewCount;
	}

	public PhotoDTO(Long photoId, String photoTitle, String photoWriter, String photoContents, Timestamp photoWriteDate,
			Long photoViewCount) {
		super();
		this.photoId = photoId;
		this.photoTitle = photoTitle;
		this.photoWriter = photoWriter;
		this.photoContents = photoContents;
		this.photoWriteDate = photoWriteDate;
		this.photoViewCount = photoViewCount;
	}

	public PhotoDTO() {
		super();
	}

}
