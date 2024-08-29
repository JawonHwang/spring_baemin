package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Player;
import com.baemin.dto.PlayerDTO;

@Mapper(componentModel = "spring")
public interface PlayerMapper extends GenericMapper<PlayerDTO, Player> {

}
