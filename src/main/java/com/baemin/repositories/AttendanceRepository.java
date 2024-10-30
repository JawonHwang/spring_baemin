package com.baemin.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.baemin.domain.entity.Attendance;
import com.baemin.domain.entity.Member;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	Attendance findByAttAtAndMember(LocalDate attAt, Member member);
	
	@Query("SELECT a FROM Attendance a WHERE a.attAt BETWEEN :startDate AND :endDate ORDER BY a.attAt ASC")
    List<Attendance> findAllByAttAtBetween(LocalDate startDate, LocalDate endDate);
}
