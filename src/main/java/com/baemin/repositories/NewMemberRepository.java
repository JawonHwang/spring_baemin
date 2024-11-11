package com.baemin.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.baemin.domain.entity.NewMember;


@Repository
public interface NewMemberRepository extends JpaRepository<NewMember, Long> {
	NewMember findByNewMemberDate(LocalDate newMemberDate);

    List<NewMember> findByNewMemberDateBetween(LocalDate startDate, LocalDate endDate);
    
    @Query("SELECT SUM(n.newMemberCount) FROM NewMember n")
    Integer sumNewMemberCount();
}