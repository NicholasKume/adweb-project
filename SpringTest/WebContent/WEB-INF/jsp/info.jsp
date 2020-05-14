<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Member information</title>
</head>
<body>
<h2> Your Information given are:</h2>
   <%= request.getParameter("id") %><br/>
   <%= request.getParameter("fname") %><br/>
   <%= request.getParameter("lname") %><br/>
   
   
<h4>Insert Your Username and Password information:</h4>
<%= session.getAttribute("username") %>, 
<%= session.getAttribute("password") %>

</body>
</html>