package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Notice;
import com.baemin.dto.NoticeDTO;

@Mapper(componentModel = "spring")
public interface NoticeMapper  extends GenericMapper<NoticeDTO, Notice>{

}
