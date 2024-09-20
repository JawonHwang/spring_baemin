package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.PayMethod;
import com.baemin.dto.PayMethodDTO;

@Mapper(componentModel = "spring")
public interface PayMethodMapper extends GenericMapper<PayMethodDTO, PayMethod> {

}
