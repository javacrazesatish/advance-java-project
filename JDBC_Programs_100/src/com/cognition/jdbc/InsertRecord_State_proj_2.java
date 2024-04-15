package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord_State_proj_2 {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_100";

	private static final String dbUserName = "root";

	private static final String dbPWD = "root";

	public static void main(String[] args) {

		// load driver--

		// database connection --

		// statement

		// result processs

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected Successfullt..!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			Connection connection = DriverManager.getConnection(url, dbUserName, dbPWD);
			System.out.println("Database Connected Successfullt..!");

			Statement statement = connection.createStatement();

			String query = String.format("INSERT INTO product(prodId, prodName, price) VALUES(%d, '%s', %d)", 3, "T-shirt",
					5000);

			int rowAffected = statement.executeUpdate(query);
			
			if(rowAffected>0) {
				System.out.println("Record is Inserted ..!");
			}else {
				System.out.println("Records  NOT Found ");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
