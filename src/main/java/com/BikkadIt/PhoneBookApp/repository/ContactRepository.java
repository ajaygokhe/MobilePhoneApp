package com.BikkadIt.PhoneBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.PhoneBookApp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
