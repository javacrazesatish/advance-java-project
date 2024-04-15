<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <% 
        String usename=(String) request.getAttribute("user_key");
      %> --%>

	<%
      String usename=(String) session.getAttribute("user_key");
      %>
	<h3>
		get key value:
		<%= usename %>
	</h3>

	<a href="profile.jsp">Profile </a> &nbsp;&nbsp;&nbsp;
	<a href="aboutus.jsp">About Us </a>
</body>
</html>