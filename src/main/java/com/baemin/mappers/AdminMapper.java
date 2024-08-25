package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Admin;
import com.baemin.dto.AdminDTO;

@Mapper(componentModel = "spring")
public interface AdminMapper extends GenericMapper<AdminDTO, Admin>{

}
