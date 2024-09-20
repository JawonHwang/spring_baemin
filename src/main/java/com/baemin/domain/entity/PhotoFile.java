package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PHOTO_FILES")
public class PhotoFile {

	@Id
	@Column(name = "PHOTO_FILE_ID")
	private Long photoFileId;

	@Column(name = "PHOTO_FILE_PARENT_ID")
	private Long photoFileParentId;

	@Column(name = "PHOTO_FILE_ORI_NAME")
	private String photoFileOriName;

	@Column(name = "PHOTO_FILE_SYS_NAME")
	private String photoFileSysName;

	public Long getPhotoFileId() {
		return photoFileId;
	}

	public void setPhotoFileId(Long photoFileId) {
		this.photoFileId = photoFileId;
	}

	public Long getPhotoFileParentId() {
		return photoFileParentId;
	}

	public void setPhotoFileParentId(Long photoFileParentId) {
		this.photoFileParentId = photoFileParentId;
	}

	public String getPhotoFileOriName() {
		return photoFileOriName;
	}

	public void setPhotoFileOriName(String photoFileOriName) {
		this.photoFileOriName = photoFileOriName;
	}

	public String getPhotoFileSysName() {
		return photoFileSysName;
	}

	public void setPhotoFileSysName(String photoFileSysName) {
		this.photoFileSysName = photoFileSysName;
	}

	public PhotoFile(Long photoFileId, Long photoFileParentId, String photoFileOriName, String photoFileSysName) {
		super();
		this.photoFileId = photoFileId;
		this.photoFileParentId = photoFileParentId;
		this.photoFileOriName = photoFileOriName;
		this.photoFileSysName = photoFileSysName;
	}

	public PhotoFile() {
		super();
	}

}
