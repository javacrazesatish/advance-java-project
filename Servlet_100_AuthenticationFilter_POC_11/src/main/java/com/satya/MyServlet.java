package com.satya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		out.println("<h2 style=color:green;> Login Success......!</h2>");
		
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().println("Authorized User..");
	}

}
