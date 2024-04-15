package com.satya;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out= pageContext.getOut();
		try {
			out.println("<h1 style='color:green;'> Show Current Time...</h1>");
			out.println(new Date().toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
}
