package com.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.finance.entity.Contact;
import com.finance.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	

	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute Contact contact) {
		System.out.println("Working");
		contactService.saveContact(contact);
		System.out.println(contact);
		return "redirect:/";
	}
}
