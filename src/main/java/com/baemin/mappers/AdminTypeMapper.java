package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.AdminType;
import com.baemin.dto.AdminTypeDTO;

@Mapper(componentModel = "spring")
public interface AdminTypeMapper extends GenericMapper<AdminTypeDTO, AdminType>{

}
