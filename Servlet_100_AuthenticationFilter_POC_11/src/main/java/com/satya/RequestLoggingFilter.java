package com.satya;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class RequestLoggingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// Log Information about the incoming request
		System.out.println("Request Recieve form IP :" + request.getRemoteAddr());
		System.out.println("Request for Resource getRequestId :" + request.getRequestId());

		// Continue with the request
		chain.doFilter(request, response);

		// Log Information about the outgoing response

		System.out.println("Respone Status :" + response.getContentType());
		System.out.println("Respone content length :" + response.getBufferSize());

	}

}
