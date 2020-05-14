<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1> Your registered Information</h1>
   <jsp:useBean id="stinfo" class="com.hccs.adweb">
   <jsp:setProperty name="stinfo" property="*"/>
   </jsp:useBean>
   <h2><jsp:getProperty name="stinfo" property="id"/></h2>
   <h2><jsp:getProperty name="stinfo" property="fname"/></h2>
   <h2><jsp:getProperty name="stinfo" property="lname"/></h2>
   <h2><jsp:getProperty name="stinfo" property="DOB"/></h2>
   
   
   Expression Language:
   ${stinfo.id} <br/>${stinfo.fname } <br/> ${stinfo.lname} <br/>${stinfo.DOB }<br/>


</body>
</html>

    