package com.ameed.contacts.dao;

public class ItemsApplications {
	public static void main(String[] args) {
		ItemsDAO dao = new ItemsDAO();
		Item item = dao.findItemByName("chair");
		System.out.println(item);
		item = dao.findItemByName("table");
		System.out.println(item);
	}
}
