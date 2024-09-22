package com.baemin.mappers;

import org.mapstruct.Mapper;

import com.baemin.domain.entity.MemberTier;
import com.baemin.dto.MemberTierDTO;

@Mapper(componentModel = "spring")
public interface MemberTierMapper extends GenericMapper<MemberTierDTO, MemberTier> {

}
