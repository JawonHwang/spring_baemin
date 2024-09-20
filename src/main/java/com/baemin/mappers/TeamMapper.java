package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Team;
import com.baemin.dto.TeamDTO;

@Mapper(componentModel = "spring")
public interface TeamMapper extends GenericMapper<TeamDTO, Team> {

}
