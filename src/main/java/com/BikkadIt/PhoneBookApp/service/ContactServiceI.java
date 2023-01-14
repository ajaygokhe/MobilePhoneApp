package com.BikkadIt.PhoneBookApp.service;

import java.util.List;

import com.BikkadIt.PhoneBookApp.entity.Contact;

public interface ContactServiceI {

	public boolean createContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	public Contact getContactById(Integer cantactId);
	
	
}
