package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.ClubNum;
import com.baemin.dto.ClubNumDTO;

@Mapper(componentModel = "spring")
public interface ClubNumMapper extends GenericMapper<ClubNumDTO, ClubNum> {

}
