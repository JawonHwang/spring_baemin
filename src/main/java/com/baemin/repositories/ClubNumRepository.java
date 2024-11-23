package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.ClubNum;
import com.baemin.domain.entity.MemberTier;

public interface ClubNumRepository extends JpaRepository<ClubNum, Integer> {
	List<ClubNum> findByStartYear(int year);
	ClubNum findBySemester(int semester);
	ClubNum findByStartYearAndSemester(int startYear, int semester);
	
	ClubNum findFirstByOrderByClubNumIdDesc();
	
	
	ClubNum findByClubNumId(Long Id);
}
