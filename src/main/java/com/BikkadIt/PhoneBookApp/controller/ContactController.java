package com.BikkadIt.PhoneBookApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.PhoneBookApp.entity.Contact;
import com.BikkadIt.PhoneBookApp.service.ContactServiceI;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value = "/saveContact",consumes = "application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
		boolean createContact = contactServiceI.createContact(contact);
	
		if(createContact) {
			String msg="Contact saved successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Contact Not saved",HttpStatus.NO_CONTENT);
		}
	}
	
	
	@GetMapping(value = "/getAllData",produces = "application/json")
	public ResponseEntity<List<Contact>> getAllData(){
		List<Contact> contact = contactServiceI.getAllContact();
		return new ResponseEntity<List<Contact>>(contact,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getSingleId/{contactId}",produces = "application/json")
	public ResponseEntity<Contact> getSingleId(@PathVariable Integer contactId){
		
		Contact contact = contactServiceI.getContactById(contactId);
		return new ResponseEntity<Contact>(contact,HttpStatus.OK);
	}
}
