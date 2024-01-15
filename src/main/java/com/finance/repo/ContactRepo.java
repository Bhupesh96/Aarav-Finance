package com.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
