package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Board;
import com.baemin.dto.BoardDTO;

@Mapper(componentModel = "spring")
public interface BoardMapper extends GenericMapper<BoardDTO, Board>{

}
