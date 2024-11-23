package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.TotalFee;
import com.baemin.dto.TotalFeeDTO;

@Mapper(componentModel = "spring")
public interface TotalFeeMapper extends GenericMapper<TotalFeeDTO, TotalFee> {

}
