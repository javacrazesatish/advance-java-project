<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
           <%! int a=10; %>
           <% int a=20; %>
           
           local variable(a) value:: <%=a %> <br>
           global variable(a) value:: <%=this.a %> <br>
           global variable(a) value:: <%=((index_jsp)page).a %> <br>
           
           
</body>
</html>