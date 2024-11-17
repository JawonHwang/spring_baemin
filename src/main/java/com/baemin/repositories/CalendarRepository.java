package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

	Calendar findByCalId(Long calId);

}
