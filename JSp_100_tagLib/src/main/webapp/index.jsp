<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="satya" %> 
<!DOCTYPE html>
<html>

<body>
     <h1>TagLib Directive </h1>
    <satya:out value="Hello Satya"></satya:out>
     
     <hr>
     
     <satya:forEach var="i" begin="1" end="20">
     <satya:out value="${i}"></satya:out>
     </satya:forEach>

	
</body>
</html>