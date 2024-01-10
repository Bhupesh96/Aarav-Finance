package com.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
