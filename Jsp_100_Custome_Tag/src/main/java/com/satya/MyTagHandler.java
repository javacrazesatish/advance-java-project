package com.satya;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		try {
			
		
		JspWriter out= pageContext.getOut();
		
			out.println("<h1>Good Morning</h1>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}


