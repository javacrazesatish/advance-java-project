package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchRec_PrepStat_prom7 {

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

			String insertRecored = "SELECT * FROM Product WHERE prodId = ?";

			PreparedStatement ps = connection.prepareStatement(insertRecored);
			ps.setInt(1, 5);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int prodId=rs.getInt("prodId");
				String prodName=rs.getString("prodName");
				int price=rs.getInt("price");
				
				System.out.println("PRODID  : "+prodId   +" PRODNAME : "+  prodName  +" PRICE  "+ price  );
				
				
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
