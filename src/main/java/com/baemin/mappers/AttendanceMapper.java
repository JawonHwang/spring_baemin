package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Attendance;
import com.baemin.dto.AttendanceDTO;

@Mapper(componentModel = "spring")
public interface AttendanceMapper extends GenericMapper<AttendanceDTO, Attendance>{

}
