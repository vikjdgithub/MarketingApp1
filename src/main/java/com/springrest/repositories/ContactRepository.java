package com.springrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
