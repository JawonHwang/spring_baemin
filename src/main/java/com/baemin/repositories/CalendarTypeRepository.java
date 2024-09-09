package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.CalendarType;

public interface CalendarTypeRepository extends JpaRepository<CalendarType, Long>{

}
