package com.cognition.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_db";
	private static final String dbName = "root";
	private static final String dbPwd = "root";

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected succefully ");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, dbName, dbPwd);
			Statement statement = con.createStatement();
			
			String updatetQuery = String.format("UPDATE student SET name='%s' where id='%d'","krishna",3);
			
			int rowAffected = statement.executeUpdate(updatetQuery);

			if (rowAffected > 0) {
				System.out.println("Data Updated SuccessFully..!");
			} else {
				System.out.println("Data Not Updated ..!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
