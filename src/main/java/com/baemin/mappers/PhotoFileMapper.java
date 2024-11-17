package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.PhotoFile;
import com.baemin.dto.PhotoFileDTO;

@Mapper(componentModel = "spring")
public interface PhotoFileMapper extends GenericMapper<PhotoFileDTO, PhotoFile>{

}
