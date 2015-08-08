package com.pluralsight.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.pluralsight.view.Phone;

public class Attendee {
	
	@Size(min=2, max=30)
	private String name;
	
	@NotEmpty @Email
	private String emailAddress;
	
	@NotEmpty @Phone
	private String phone;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}