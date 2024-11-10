package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.BoardFile;
import com.baemin.dto.BoardFileDTO;

@Mapper(componentModel = "spring")
public interface BoardFileMapper extends GenericMapper<BoardFileDTO, BoardFile>{

}
