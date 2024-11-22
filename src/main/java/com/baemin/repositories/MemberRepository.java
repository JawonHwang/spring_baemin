package com.baemin.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.baemin.domain.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

	Member findAllByMemName(String userName);

	List<Member> findByMemNameAndMemEmail(String name, String email);

	Member findAllByMemId(String email);
	
	Member findByMemId(String MemId);

	Optional<Member> findByMemStuId(String memStuId);

	List<Member> findAll();

	List<Member> findByRole(String role);

	List<Member> findByIsBan(boolean isBan);

	@Query("SELECT COUNT(v) FROM Member v")
	Integer countMember();
}
