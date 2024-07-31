package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

	List<Member> findByNameAndEmail(String name, String email);
	
	Member findAllById(String email);
	
}
