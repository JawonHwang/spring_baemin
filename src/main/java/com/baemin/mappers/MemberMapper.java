package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.Member;
import com.baemin.dto.MemberDTO;

@Mapper(componentModel = "spring")
public interface MemberMapper extends GenericMapper<MemberDTO, Member>{

}
