<%@page import="java.util.Date"%>
<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<!-- <h1 style="color:green; text-align:center "> Welcome to Java Server Page</h1> -->
	<%!
	/**   get for  wish meassage  */
     	String getMessage() {
	   String user = "satya";
		LocalTime lt = LocalTime.now();
		int hour = lt.getHour();

		if (hour < 12) {
			return "Good Morning : " + user;
		} else if (hour < 16) {
			return "Good Afternnon : " + user;
		} else if (hour < 20) {
			return "Good Evening : " + user;
		} else {
			return "Good Night : " + user;
		} 
		
	}%>
	
	
	 
	
	<br><b>Date and time : <%=new Date() %> </b>
	
<%-- 	<br> <%request.getParameter(arg0) %> --%>  

      <br><br> <b> Wish message is: <%= getMessage()%></b>
	
</body>
</html>