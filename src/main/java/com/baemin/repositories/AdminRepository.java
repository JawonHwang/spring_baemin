package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baemin.domain.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {
	List<Admin> findAll();
	
	Admin findByAdminId(String adminId);
}
