package com.cognition.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetRecord_PreperedStat_Demo {

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
			String updatetQuery = String.format("SELECT * From student where name = ?");

			PreparedStatement prepStatement = con.prepareStatement(updatetQuery);
			prepStatement.setString(1, "Ankita");

			ResultSet result = prepStatement.executeQuery();

			while (result.next()) {
				int no = result.getInt("id");
				String name = result.getString("name");
				String addr = result.getString("addr");

				System.out.println(no);
				System.out.println(name);
				System.out.println(addr);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
