package com.springrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
