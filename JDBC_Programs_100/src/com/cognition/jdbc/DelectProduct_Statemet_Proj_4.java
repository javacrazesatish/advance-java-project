package com.cognition.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DelectProduct_Statemet_Proj_4 {
	
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
			
			String query="DELETE FROM  Product where prodId=6";
			
			int rowAffected = statement.executeUpdate(query);//executeQuery->select    //executeUpdate=save/insert   update  delete
			if(rowAffected>0) {
				System.out.println("Product Get Deleted Successfully..!");
			}else {
				System.out.println("Product Not Found");
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage()+" get error maessage method:: ");
			e.printStackTrace();
			
		}
		
		

	}

}
