package com.cognition.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

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

		Connection con;
		try {
			con = DriverManager.getConnection(url, dbName, dbPwd);

			System.out.println("connection get successfully");

			Statement statement = con.createStatement();
//			String query = "SELECT * FROM Student";
//
//			ResultSet result = statement.executeQuery(query);
//
//			while (result.next()) {
//				int no = result.getInt("id");
//				String name = result.getString("name");
//				String addr = result.getString("addr");
//				
//				System.out.println(no);
//				System.out.println(name);
//				System.out.println(addr);
//			}
			String insertQuery="INSERT INTO jdbc_db.student(id, name, addr) VALUES(3,'sham','punea');";
//			String insertQuery = String.format("INSERT INTO jdbc_db.student(id, name, addr) VALUES(%d, %s, %s)",3,"sham","punea");
			
			System.out.println("insertQuery  :  "+insertQuery);
			
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
