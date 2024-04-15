package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecord_State_Proj_1 {
	
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
			
			String query="SELECT * FROM product";
			
			ResultSet resultSet= statement.executeQuery(query);//executeQuery->select  
			                                                  //executeUpdate=save/insert   update
			
			while (resultSet.next()) {//true
				int prodId=resultSet.getInt("prodId");
				String prodName=resultSet.getString("prodName");
				int price=resultSet.getInt("price");
				System.out.println(" ********************************");
				System.out.println("PRODID : "+prodId);
				System.out.println("PRODNAME : "+prodName);
				System.out.println("PRICE : "+price);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage()+" get error maessage method:: ");
			e.printStackTrace();
			
		}
		
		

	}

}
