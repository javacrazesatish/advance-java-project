package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord_Statemet_Proj3 {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_100";

	private static final String dbUserName = "root";

	private static final String dbPWD = "root";

	public static void main(String[] args) {

		// load driver--

		// database connection --

		// statement

		// result process

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected Successfully..!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			Connection connection = DriverManager.getConnection(url, dbUserName, dbPWD);
			System.out.println("Database Connected Successfully..!");

			Statement statement = connection.createStatement();

			String query = String.format("UPDATE PRODUCT SET prodName = '%s', price = %d WHERE prodId = %d","pant",1500,3);
					

			int rowAffected = statement.executeUpdate(query);
			
			if(rowAffected>0) {
				System.out.println("Product is Updated Successfully..!");
			}else {
				System.out.println("Product  NOT Found ");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
