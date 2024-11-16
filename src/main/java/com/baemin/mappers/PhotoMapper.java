package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Photo;
import com.baemin.dto.PhotoDTO;

@Mapper(componentModel = "spring")
public interface PhotoMapper extends GenericMapper<PhotoDTO, Photo>{

}
