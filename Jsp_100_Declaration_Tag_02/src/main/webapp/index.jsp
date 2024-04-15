<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
         <%! public int sum(int x,int y){
        	 return x+y;
         }%>
         
         <b> The result is :: <%=sum(10,20) %></b>
</body>
</html>