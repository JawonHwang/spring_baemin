package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.ActivityDate;

public interface ActivityDateRepository extends JpaRepository<ActivityDate, Integer> {

}
