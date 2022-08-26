package com.springrest.services;

import java.util.List;

import com.springrest.entities.Contact;

public interface ContactService {

	public void saveOneContact(Contact contact );
	
	public List<Contact> listContacts();
	
	public Contact getOneContact(long id);

	
}
