package com.satya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/form")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (username.equalsIgnoreCase("satish@gmail.com") && password.equalsIgnoreCase("sanap")) {

//			req.setAttribute("user_key", "satish");
			
			HttpSession session=req.getSession();
			session.setAttribute("user_key", "satya");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		} else {
			out.println("<h1 Style='color:red;'>Email Id and password Not Match ");
			out.println();
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);

		}
	}
}
