package com.baemin.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PHOTOS")
public class Photo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PHOTO_ID")
	private Long photoId;

	@Column(name = "PHOTO_TITLE")
	private String photoTitle;

	@Column(name = "PHOTO_WRITER")
	private String photoWriter;

	@Column(name = "PHOTO_CONTENTS")
	private String photoContents;

	@Column(name = "PHOTO_WRITE_DATE")
	private Timestamp photoWriteDate;

	@Column(name = "PHOTO_VIEW_COUNT")
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

	public Photo(Long photoId, String photoTitle, String photoWriter, String photoContents, Timestamp photoWriteDate,
			Long photoViewCount) {
		super();
		this.photoId = photoId;
		this.photoTitle = photoTitle;
		this.photoWriter = photoWriter;
		this.photoContents = photoContents;
		this.photoWriteDate = photoWriteDate;
		this.photoViewCount = photoViewCount;
	}

	public Photo() {
		super();
	}

}
