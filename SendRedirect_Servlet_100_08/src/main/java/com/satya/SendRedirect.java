package com.satya;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormRedirect")
public class SendRedirect extends HttpServlet { 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String search = req.getParameter("searchAny");
		
//		 resp.sendRedirect("http://www.google.com");
		
		resp.sendRedirect("http://www.google.com/search?q="+search);
	}

}
