<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index file</title>
</head>
<body>

                   
           <jsp:useBean id="emp" class="com.satya.Employyee"></jsp:useBean>
           <%
           
           emp.setEmpId(1);
           emp.setAddrss("pune");
           emp.setSal(100000);
           
           int empid=emp.getEmpId();
           int sal=emp.getSal();
           String addr=emp.getAddrss();
           out.println("empId :"+empid+ " sal :"+sal+" address :"+addr);
           %>
          
</body>
</html>