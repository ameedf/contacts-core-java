package com.ameed.contacts;

public class Address implements ContactDetails {
	private String street;
	private String city;
	private int homeNumber;

	public Address(String street, String city, int homeNumber) {
		super();
		this.street = street;
		this.city = city;
		this.homeNumber = homeNumber;
	}

	public Type getType() {
		return Type.ADDRESS;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", homeNumber=" + homeNumber + "]";
	}

}
