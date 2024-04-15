package com.cognition.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

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

			System.out.println("connection get successfully");

			Statement statement = con.createStatement();

			String insertQuery = String.format("INSERT INTO student(id, name, addr) VALUES('%d', '%s', '%s')", 6,
					"sham", "punea");
			

			System.out.println("insertQuery  :  " + insertQuery);

			int rowAffected = statement.executeUpdate(insertQuery);

			if (rowAffected > 0) {
				System.out.println("Data Inserted SuccessFully..!");
			} else {
				System.out.println("Data Not Inserted ..");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
