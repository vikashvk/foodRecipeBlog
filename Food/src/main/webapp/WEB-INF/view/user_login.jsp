<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A_Login</title>
</head>
<body>
<br><br>
<center><h2>User Login</h2></center>
<br>
<center>
<f:form method= "POST" action = "userLogin" modelAttribute = "user" >
User Name:
<f:input type = "text" path = "username"/><br>
<f:errors path = "username"></f:errors>
<br>
Password: 
<f:input type = "password" path = "password"/><br><br>
<f:errors path = "password"></f:errors>
<br>

<input type = "submit" value= "Login"/>


</f:form>
</center>

<%session.setAttribute("usrnm", request.getParameter("username")); %>

	<b>${Flogin}</b>
	

</body>
</html>