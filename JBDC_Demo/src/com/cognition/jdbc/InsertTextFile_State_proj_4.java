package com.cognition.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTextFile_State_proj_4 {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_100";

	private static final String dbUserName = "root";

	private static final String dbPWD = "root";

	public static void main(String[] args) throws FileNotFoundException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected Successfullt..!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		

		try {
			Connection connection = DriverManager.getConnection(url, dbUserName, dbPWD);
			System.out.println("Database Connected Successfullt..!");

			File file = new File("C:\\Users\\User\\Downloads\\jdbc_100_clob_demo.txt");
			System.out.println("file  :"+file);
//			FileInputStream fis = new FileInputStream(file);
			FileReader fr=new FileReader(file);
			System.out.println("file reader :"+fr);
//			System.out.println("inserting image from " + file.getAbsolutePath());
			String query ="INSERT INTO clob_demo(id,textFile) VALUES(?,?)";
			PreparedStatement prepStatement = connection.prepareStatement(query);

			prepStatement.setInt(1, 2);
			prepStatement.setCharacterStream(2,fr);

			prepStatement.execute();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
