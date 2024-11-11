package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.NewMember;
import com.baemin.dto.NewMemberDTO;


@Mapper(componentModel = "spring")
public interface NewMemberMapper extends GenericMapper<NewMemberDTO, NewMember>{

}
