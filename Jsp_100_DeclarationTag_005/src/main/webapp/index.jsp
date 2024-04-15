<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

    <%!
        String wishMSG=" Hello Good Morning ";
    
        String getName(){
        	return "Satya";
        }
    %>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration Tag Example</title>
</head>
<body>
        <h1 style="color:#0000ff"> <%=wishMSG   + getName()  %></h1>
</body>
</html>