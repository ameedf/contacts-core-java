package com.ameed.contacts;

public class PhoneNumber implements ContactDetails {
	private String phone;

	public PhoneNumber(String phone) {
		super();
		this.phone = phone;
	}

	public Type getType() {
		return Type.PHONE_NUMBER;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + "]";
	}

}
