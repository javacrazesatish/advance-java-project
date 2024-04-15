package com.cognition.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord_State_proj_2 {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_100";

	private static final String dbUserName = "root";

	private static final String dbPWD = "root";

	public static void main(String[] args) throws FileNotFoundException {

		// load driver--

		// database connection --

		// statement

		// result processs

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected Successfullt..!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		

		try {
			Connection connection = DriverManager.getConnection(url, dbUserName, dbPWD);
			System.out.println("Database Connected Successfullt..!");

			File file = new File("C:\\Users\\User\\Downloads\\Untitled-1.jpg");

			FileInputStream fis = new FileInputStream(file);
			System.out.println("inserting image from " + file.getAbsolutePath());
			String query ="INSERT INTO student(id, name,text) VALUES(?, ?, ?)";
			PreparedStatement prepStatement = connection.prepareStatement(query);

			prepStatement.setInt(1, 2);
			prepStatement.setString(2, "ghidorah");
			prepStatement.setBinaryStream(3,fis );

			prepStatement.execute();

//			if (rowAffected > 0) {
//				System.out.println("Record is Inserted ..!");
//			} else {
//				System.out.println("Records  NOT Found ");
//			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
