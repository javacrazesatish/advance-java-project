package com.satya;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyFirstCustome extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
	
		try {
		JspWriter out = pageContext.getOut();
			out.println("<h1 Style='color:green;'> Welcome to First Custome Tag</h1>");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
