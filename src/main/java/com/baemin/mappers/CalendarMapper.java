package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Calendar;
import com.baemin.dto.CalendarDTO;

@Mapper(componentModel = "spring")
public interface CalendarMapper extends GenericMapper<CalendarDTO, Calendar>{

}
