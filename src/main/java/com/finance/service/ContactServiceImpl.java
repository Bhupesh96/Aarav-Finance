package com.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.entity.Contact;
import com.finance.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepo repo;

	@Override
	public Contact saveContact(Contact contact) {
		Contact newContact = repo.save(contact);
		return newContact;
	}

}
