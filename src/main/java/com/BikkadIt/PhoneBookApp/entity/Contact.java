package com.BikkadIt.PhoneBookApp.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTACT_ID")
	private Integer contactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_NUMBER")
	private String cantactNumber;
	@Column(name = "CONTACT_EMAIL")
	private String cantactEmail;
	@Column(name = "CONTACT_ACTIVE_SWITCH")
	private Character activeSwitch;
	
	
	@Column(name = "CONTACT_CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	
	@Column(name = "CONTACT_UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;


	public Integer getContactId() {
		return contactId;
	}


	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getCantactNumber() {
		return cantactNumber;
	}


	public void setCantactNumber(String cantactNumber) {
		this.cantactNumber = cantactNumber;
	}


	public String getCantactEmail() {
		return cantactEmail;
	}


	public void setCantactEmail(String cantactEmail) {
		this.cantactEmail = cantactEmail;
	}


	public Character getActiveSwitch() {
		return activeSwitch;
	}


	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public LocalDate getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}


	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", cantactNumber=" + cantactNumber
				+ ", cantactEmail=" + cantactEmail + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
	
	
}
