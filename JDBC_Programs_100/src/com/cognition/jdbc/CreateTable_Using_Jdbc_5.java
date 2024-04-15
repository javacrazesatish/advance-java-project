package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable_Using_Jdbc_5 {

private static final String url="jdbc:mysql://localhost:3306/jdbc_100";
	
	private static final String dbUserName="root";
	
	private static final String dbUserPwd="root";
	
	public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Successfully Connected ...!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection con = DriverManager.getConnection(url, dbUserName, dbUserPwd);
			System.out.println("Database Connected Successfully  ...!");
			
			Statement statement=con.createStatement();
			
			String query="CREATE TABLE user(id INT PRIMARY KEY NOT NULL, name VARCHAR(255) NOT NULL); ";
			
			statement.execute(query);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			
		}  

	}

}
