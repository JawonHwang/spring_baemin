package com.baemin.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.baemin.domain.entity.Visitor;


@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByVisitorDate(LocalDate visitorDate);

    List<Visitor> findByVisitorDateBetween(LocalDate startDate, LocalDate endDate);
    @Query("SELECT SUM(v.visitorCount) FROM Visitor v")
    Integer sumVisitorCount();
    
}