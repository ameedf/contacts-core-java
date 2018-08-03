package com.ameed.contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactsApplication {
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		ContactsHandler handler = new ContactsHandler();
		contacts.add(handler.createContact("a1"));
		contacts.add(handler.createContact("a2"));
		contacts.add(handler.createContact("a3"));
		contacts.add(handler.createContact("a4"));
		contacts.add(handler.createContact("a5"));
		contacts.add(handler.createContact("a6"));
		contacts.add(handler.createContact("a7"));
		contacts.add(handler.createContact("a8"));
		
		Contact contact = contacts.get(1);
		List<ContactDetails> details = contact.getDetails();
		details.add(handler.createAddress("haifa", "street1", 3));
		
		contacts.get(5).getDetails().add(handler.createAddress("my-city", "my-street", 1));
	}
}
