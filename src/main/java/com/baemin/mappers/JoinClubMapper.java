package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.JoinClub;
import com.baemin.dto.JoinClubDTO;

@Mapper(componentModel = "spring")
public interface JoinClubMapper extends GenericMapper<JoinClubDTO, JoinClub>{

}
