package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.MemberShipFee;
import com.baemin.dto.MemberShipFeeDTO;

@Mapper(componentModel = "spring")
public interface MemberShipFeeMapper extends GenericMapper<MemberShipFeeDTO, MemberShipFee> {

}
