package com.ada.ada.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ada.ada.domain.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}
