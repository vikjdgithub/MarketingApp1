package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springrest.entities.Contact;
import com.springrest.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listallcontact")
	public String listAllController(ModelMap model) {
		
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts", contacts);
		
		return "search_contact";
	}
	
}
