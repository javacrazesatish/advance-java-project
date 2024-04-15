<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h1 style="color:red;"> print Date page </h1>
       
       <h1 style="color:green;"><%=new Date().toString() %> </h1>
       
       <h1 style="color:blue;"><%=request.getParameter("satya") %></h1>
</body>
</html>