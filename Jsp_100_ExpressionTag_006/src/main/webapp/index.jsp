<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression Tag Example </title>
</head>
<body>
            <p> Result of expression <%=10+ 20 %>  </p>
            
            <h1  style='color:green;'>  <%= new Date() %></h1>
</body>
</html>