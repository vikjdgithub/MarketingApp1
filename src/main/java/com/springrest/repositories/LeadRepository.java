package com.springrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
