<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style= "color: green;">This is index header</h1>
	<hr>
	<jsp:include page="welcome.jsp">
		<jsp:param value="satya" name="name" />
	</jsp:include>
    <hr>
	<h1 style="color: green;">This is index footer</h1>
</body>
</html>