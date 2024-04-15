package com.cognition.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_PreperedStat_Demo {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_db";
	private static final String dbName = "root";
	private static final String dbPwd = "root";

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected succefully.. ");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, dbName, dbPwd);
			System.out.println("Connected to DB succefully.. ");
			String updatetQuery = String.format("UPDATE student SET name = ? where id = ?");
			
			PreparedStatement prepStatement = con.prepareStatement(updatetQuery);
			prepStatement.setString(1, "Suraj");
			prepStatement.setInt(2, 4);

			int rowAffected = prepStatement.executeUpdate();

			if (rowAffected > 0) {
				System.out.println("Data Inserted SuccessFully..!");
			} else {
				System.out.println("Data Not Inserted ..!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
