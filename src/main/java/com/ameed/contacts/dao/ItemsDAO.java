package com.ameed.contacts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemsDAO {
	private static final String URL = "jdbc:mysql://localhost:3306/ameed2?useSSL=false";
	//private static final String URL = "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>";
	private Connection connection;

	public ItemsDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(URL, "root", "mysql12");
		} catch (Exception e) {
			throw new RuntimeException("Error connecting to DB. Message: " + e.getMessage());
		}
	}

	public Item findItemByName(String itemName) {
		String sql = "select * from items where name = '" + itemName + "'";
		try (Statement statement = connection.createStatement(); 
				ResultSet rs = statement.executeQuery(sql)) {
			if (rs.next()) {
				Item item = new Item(rs.getInt(1), rs.getString(2));
				return item;
			}
			return null;
		} catch (SQLException e) {
			throw new RuntimeException("Error while executing query. Message: " + e.getMessage());
		}
	}
}
