package com.satya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


//Servlet   interface
//GenericServlet   AClass
//HttpServlet       AClass


public class Voter implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		//set contentType 
		
		resp.setContentType("text/html");
		
		//get PrintWriter
		PrintWriter pw =resp.getWriter();
		
		// take the request parameter
		String voterNo = req.getParameter("voterNo");
		
		String name = req.getParameter("voterName");
		
		String voterAge = req.getParameter("voterAge");
		
		System.out.println("voterName "+name);
		System.out.println("voterNo "+voterNo);
		System.out.println("voterAge "+voterAge);
		
		int age= Integer.parseInt(voterAge);
		
		//validation
		
		if(age>=21) {
			
			pw.println("<html><body>");
			pw.println();
			pw.println("<h1 style=color:red> "+name+" You Are Eligible for Vote...!</h1>");
			pw.println("</html></body>");
		}else {
			pw.println("<html><body>");
			pw.println();
			pw.println("<h1 style=color:red> "+name+" You Are Not Eligible for Vote...!</h1>   ");
			pw.println("<h4 style=color:red> Ab chote ho..</h4>   ");
			pw.println("</html></body>");
			
		}
		
		pw.println("<br><br><a href='VoterRegistration.html'> Home </a>");
		
	}

}
