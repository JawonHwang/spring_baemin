package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.CalendarType;
import com.baemin.dto.CalendarTypeDTO;

@Mapper(componentModel = "spring")
public interface CalendarTypeMapper extends GenericMapper<CalendarTypeDTO, CalendarType>{

}
