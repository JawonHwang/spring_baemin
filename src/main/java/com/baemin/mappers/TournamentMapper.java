package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Tournament;
import com.baemin.dto.TournamentDTO;

@Mapper(componentModel = "spring")
public interface TournamentMapper extends GenericMapper<TournamentDTO, Tournament> {

}
