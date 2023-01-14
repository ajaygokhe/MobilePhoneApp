package com.BikkadIt.PhoneBookApp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.PhoneBookApp.entity.Contact;
import com.BikkadIt.PhoneBookApp.exception.ResourceNotFoundException;
import com.BikkadIt.PhoneBookApp.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI{

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean createContact(Contact contact) {
		Contact savecontact = contactRepository.save(contact);
		
		if(savecontact!=null) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactRepository.findAll();
		
		return findAll;
	}

	@Override
	public Contact getContactById(Integer cantactId) {
		Contact contact = contactRepository.findById(cantactId).orElseThrow(()->new ResourceNotFoundException("Contact", "contactId", cantactId));
		
		return contact;
	}
	
	
}
