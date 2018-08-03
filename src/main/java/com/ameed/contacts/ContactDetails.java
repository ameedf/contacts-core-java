package com.ameed.contacts;

public interface ContactDetails {
	public enum Type {
		ADDRESS, EMAIL, PHONE_NUMBER
	}
	
	Type getType();
}
