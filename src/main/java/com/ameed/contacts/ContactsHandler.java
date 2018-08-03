package com.ameed.contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactsHandler {

	public Contact createContact(String name) {
		if (name.length() > 50) {
			throw new IllegalArgumentException("Name is longer than 50");
		}
		List<ContactDetails> details = new ArrayList<>();
		return new Contact(name, details);
	}
	
	public Address createAddress(String city, String street, int homeNumber) {
		if (homeNumber > 1000) {
			throw new IllegalArgumentException("Home number is greater than 1000");			
		}
		Address address = new Address(city, street, homeNumber);
		return address;
	}
}
