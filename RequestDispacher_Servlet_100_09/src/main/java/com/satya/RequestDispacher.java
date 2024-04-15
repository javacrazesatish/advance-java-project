package com.satya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class RequestDispacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out= resp.getWriter();
		
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");

		if (email.equals("satishsanap@gmail.com") && password.equals("satish")) {
			RequestDispatcher rd = req.getRequestDispatcher("/profile.html");
			rd.forward(req, resp);
		} else {

			out.println("<h1 style='color:red';>  Email Id and Passwod Wrong Please try Again...</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			
		}
	}

}
