package com.satya;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Servelt Interface 
// GenericServelt Ab
// HttpServlet    Ab
public class Marriage extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// set ContentType 
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		//read data from browser/client 
		
		String userName = req.getParameter("uName");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
			
		int userAge=Integer.parseInt(age);
		//validation
		
		if(gender.equalsIgnoreCase("female")) {
			if(userAge>=18) {
				pw.println("<html><body>");
				pw.println("<h1 style=color:green> Hi "+userName+" You Are Eligible for Marriage..!<h1>");
				pw.println("<h4 style=color:blue> Happyly we can Marriage");
				pw.println("</html></body>");
			}else {
				pw.println("<html><body>");
				pw.println("<h1 style=color:green> Hi "+userName+" You Are Not Eligible for Marriage..!<h1>");
				pw.println("<h4 style=color:blue> Enjoy your Childhood...");
				pw.println("</html></body>");
			}
		}else {
			if(userAge>=21) {
				pw.println("<html><body>");
				pw.println("<h1 style=color:green> Hi "+userName+" You Are Eligible for Marriage..!<h1>");
				pw.println("<h4 style=color:blue> Happyly we can Marriage");
				pw.println("</html></body>");
			}else {
				pw.println("<html><body>");
				pw.println("<h1 style=color:green> Hi "+userName+" You Are Not Eligible for Marriage..!<h1>");
				pw.println("<h4 style=color:blue> Enjoy your Childhood...");
				pw.println("</html></body>");
			}
		}
		
		pw.println("<br><br><a href='MarriageRegistraction.html'>Home</a>");
		
	}

}
