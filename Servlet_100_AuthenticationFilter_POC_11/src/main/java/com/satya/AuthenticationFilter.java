package com.satya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthenticationFilter implements Filter {

	public void init(FilterConfig config) throws ServletException {
	};

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpServletResponse httpResp = (HttpServletResponse) resp;

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if ("satish".equalsIgnoreCase(username) && "sanap".equalsIgnoreCase(password)) {

			// User is authenticated ,continue with the request chain
			chain.doFilter(httpReq, resp);
		} else {

			// User not authenticate ,send unauthorized response
			httpResp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			httpResp.getWriter().println("Unauthorized access");

			out.println("<h1 style='color:red;'>Login Fail . Please try again..</h1>");
			out.println("<h5 style='color:red;'>User Name Or Password is wrong..</h5>");

			out.println();

			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);

		}

	}

	@Override
	public void destroy() {
	}

}
