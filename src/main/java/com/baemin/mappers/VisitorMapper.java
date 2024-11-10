package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Visitor;
import com.baemin.dto.VisitorDTO;


@Mapper(componentModel = "spring")
public interface VisitorMapper extends GenericMapper<VisitorDTO, Visitor>{

}
