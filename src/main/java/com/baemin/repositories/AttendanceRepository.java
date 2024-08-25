package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
