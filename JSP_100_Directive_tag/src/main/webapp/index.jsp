<%@page import="java.util.Date"%>
<%@ page info="This is report page" language="java"
	errorPage="error.jsp" buffer="1kb" autoFlush="true"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<body>

<%@include file="header.jsp" %>

<%=new Date().toString() %>

<p style="color: green"> Hello satya .......
----
----
----
</p>

<%@include file="footer.jsp" %>
</body>




