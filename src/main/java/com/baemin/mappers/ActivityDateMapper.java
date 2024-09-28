package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.ActivityDate;
import com.baemin.dto.ActivityDateDTO;

@Mapper(componentModel = "spring")
public interface ActivityDateMapper extends GenericMapper<ActivityDateDTO, ActivityDate> {

}
