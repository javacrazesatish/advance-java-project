package com.cognition.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTextFile_PrepStat_prom11 {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc_100_demo_db";

	private static final String dbUserName = "root";

	private static final String dbPwd = "root";

	public static void main(String[] args) throws FileNotFoundException {

		// driver load
		// database connection
		// Statement Or Preparedstatement
		// Result process

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			File file = new File("C:\\Users\\User\\Downloads\\jamesG.txt");

			FileReader fr=new FileReader(file);

			Connection connection = DriverManager.getConnection(url, dbUserName, dbPwd);
			System.out.println("DB connected Successfully...!");
			String query = "INSERT INTO clob_demo(id, textFile) VALUES(?, ?)";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, 1);
			ps.setCharacterStream(2, fr);

			ps.execute();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
