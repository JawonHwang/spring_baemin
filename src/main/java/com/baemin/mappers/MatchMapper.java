package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Match;
import com.baemin.dto.MatchDTO;

@Mapper(componentModel = "spring")
public interface MatchMapper extends GenericMapper<MatchDTO, Match>{

}
