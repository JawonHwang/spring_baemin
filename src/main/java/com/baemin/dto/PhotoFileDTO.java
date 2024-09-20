package com.baemin.dto;

public class PhotoFileDTO {

	private Long photoFileId;
	private Long photoFileParentId;
	private String photoFileOriName;
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

	public PhotoFileDTO(Long photoFileId, Long photoFileParentId, String photoFileOriName, String photoFileSysName) {
		super();
		this.photoFileId = photoFileId;
		this.photoFileParentId = photoFileParentId;
		this.photoFileOriName = photoFileOriName;
		this.photoFileSysName = photoFileSysName;
	}

	public PhotoFileDTO() {
		super();
	}

}
