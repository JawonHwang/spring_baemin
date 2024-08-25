package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.TomState;
import com.baemin.dto.TomStateDTO;

@Mapper(componentModel = "spring")
public interface TomStateMapper extends GenericMapper<TomStateDTO, TomState> {

}
