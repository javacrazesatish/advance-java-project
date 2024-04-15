package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRec_PrepStat_prom6 {

	private static final String url = "jdbc:mysql://localhost:3306/db_jdbc_100";

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

			String insertRecored = "INSERT INTO PRODUCT(prodId, prodName, price) Values (?,?,?)";

			PreparedStatement ps = connection.prepareStatement(insertRecored);
			ps.setInt(1, 5);
			ps.setString(2, "laptop");
			ps.setInt(3, 30000);

			int affectedRows = ps.executeUpdate();

			if (affectedRows > 0) {
				System.out.println("Data inserted Successfully...!");
			} else {
				System.out.println("Data not inserted...!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
