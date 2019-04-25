<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
  <%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<center>
<h2>Enter User details</h2>
	
		
<f:form method= "POST" action = "getuserData" modelAttribute = "uk" >

Enter User Name: &nbsp;&nbsp; &nbsp;&nbsp; 
<f:input path = "name" />
<f:errors path="name" style="color:red" />
<br>
Enter email: &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 
<f:input type="email" path = "email"/>
<f:errors path="email" style="color:red" />
<br>
Enter contact number: 
<f:input path = "contact"/>
<f:errors path="contact" style="color:red" />
<br>

Assign User Name: &nbsp;&nbsp;&nbsp;
 <f:input path = "username"/>
<f:errors path="username" style="color:red" />
<br>
Assign Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
 <f:input path = "password"/>
<f:errors path="password" style="color:red" />
<br>


 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;<input type = "submit" value= "Add User"/>


</f:form>
		
		 ${res}
<br>
<br>
<br>
<br>
 <b> <a href="homepage">HOME</a></b>
</center>
</body>
</html>