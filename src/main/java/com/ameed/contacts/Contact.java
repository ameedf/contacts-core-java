package com.ameed.contacts;

import java.util.List;

public class Contact {
	private String name;
	private List<ContactDetails> details;

	public Contact(String name, List<ContactDetails> details) {
		super();
		this.name = name;
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ContactDetails> getDetails() {
		return details;
	}

	public void setDetails(List<ContactDetails> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", details=" + details + "]";
	}

}
