package com.satya;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WishApp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		// set ContentType
		resp.setContentType("text/html");
		// get the Response and send/display to browser PrintWriter
		PrintWriter pw = resp.getWriter();

		// Get the current hour of the day
		int hour = LocalTime.now().getHour();

		// generate a wish message based on the time of the day
		String message = "";

		if (hour >= 4 && hour < 12) {
			message = " Good Morning..! ";
		} else if (hour >= 12 && hour < 17) {
			message = " Good Afternoon..";
		} else {
			message = "Good Evening ..!";
		}

		// Diplay the wish message
		pw.println("<html><body>");
		pw.println("<h1 style=color:blue>" + message + "</h1>");
		pw.println();
		pw.println("<h4 style= color:red>Welcome to our websit...!</h4>");
		pw.println("</html></body>");

	}

}
