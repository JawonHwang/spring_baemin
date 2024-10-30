package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.FeeDetail;
import com.baemin.dto.FeeDetailDTO;

@Mapper(componentModel = "spring")
public interface FeeDetailMapper extends GenericMapper<FeeDetailDTO, FeeDetail> {

}
