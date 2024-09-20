package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.MatchTeam;
import com.baemin.dto.MatchTeamDTO;

@Mapper(componentModel = "spring")
public interface MatchTeamMapper extends GenericMapper<MatchTeamDTO, MatchTeam>{

}
