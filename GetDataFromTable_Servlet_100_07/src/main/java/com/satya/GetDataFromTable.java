package com.satya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetDataFromTable extends HttpServlet {
	
	private static final String url="jdbc:mysql://localhost:3306/userDb";
	private static final String dbUserName="root";
	private static final String dbPwd="root";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String query="Select * from userDetails ";
		
		//data connection     (Db, table) load, connection, statement,result process  
		//servlet  Business Logic/Processing/process event  
		
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Databases Loaded Successfully...!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		 try {
			  con= DriverManager.getConnection(url, dbUserName, dbPwd);
			  System.out.println("Databases Connected Successfully...!");
			  ps=con.prepareStatement(query);
			  
			ResultSet resultSet=  ps.executeQuery();
			resp.setContentType("text/html");
			PrintWriter out=  resp.getWriter();
			out.println("<html><body>");
			out.println("<h2>User Data </h2>");
			out.println("<table border=\"1\">");
			out.println("<tr><th>UserName</th> <th>Address</th><th>phoneNo</th>");
			while (resultSet.next()) {
				String usernm = resultSet.getString("username");
				String addr = resultSet.getString("address");
				int phno = resultSet.getInt("phoneNo");
				out.println("<tr><td>"+usernm+"</td><td>"+addr+"</td><td>"+phno+"</td></tr>");
			}
			
			out.println("/table");
			out.println("</body></html>");
			
			  
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
}
