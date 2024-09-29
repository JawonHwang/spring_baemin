package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Interview;
import com.baemin.dto.InterviewDTO;

@Mapper(componentModel = "spring")
public interface InterviewMapper extends GenericMapper<InterviewDTO, Interview>{

}
