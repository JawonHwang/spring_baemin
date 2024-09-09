package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.NoticeTag;
import com.baemin.dto.NoticeTagDTO;

@Mapper(componentModel = "spring")
public interface NoticeTagMapper  extends GenericMapper<NoticeTagDTO, NoticeTag>{

}
