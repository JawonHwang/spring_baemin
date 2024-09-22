package com.baemin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.AdminType;

public interface AdminTypeRepository extends JpaRepository<AdminType, Long> {
	AdminType findByAdminTypeName(String adminTypeName);
}
