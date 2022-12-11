package com.javatechie.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.crud.example.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
    Company findByName(String name);
}

