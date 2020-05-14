<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
<h1> Welcome to Nicholas Members JSP!!!!</h1>
<h3>Today's Date is : <%= new java.util.Date() %></h3>

<h3> Fill your information and submit here :</h3>

<%
session.setAttribute("username", "NicholasKume");
session.setAttribute("password", "54321");

%>
<form method="post" action="register.jsp">
	Member Id :<input type="text" name="id">
	First Name :<input type="text" name="fname">
	Last Name : <input type="text" name="lname">
	Date of Birth : <input type="text" name="DOB">
	<input type="Submit" name="submit" value="Register">
</form>
</body>
</html>