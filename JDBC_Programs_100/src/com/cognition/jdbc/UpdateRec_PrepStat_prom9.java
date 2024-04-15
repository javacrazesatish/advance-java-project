package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRec_PrepStat_prom9 {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_100";

	private static final String dbUserName = "root";

	private static final String dbPwd = "root";

	public static void main(String[] args) {
		// load driver
		// Connect Database
		// Prep-statement
		// result set Process

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver inserted Successfully...! ");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());

		}

		try {
			Connection connection = DriverManager.getConnection(url, dbUserName, dbPwd);
			System.out.println("Database Connected Succeessully..!");

			String insertRecored = "UPDATE PRODUCT SET prodName = ? where prodId=? ";

			PreparedStatement ps = connection.prepareStatement(insertRecored);
			ps.setString(1, "Coffe Cup");
			ps.setInt(2, 5);

			int affectedRows = ps.executeUpdate();

			if (affectedRows > 0) {
				System.out.println("Data Updated  Successfully...!");
			} else {
				System.out.println("Data not Udated...!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
