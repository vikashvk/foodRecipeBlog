<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>DELETE USER</h2></center>
	
	<c:url var="myAction" value="deleteUser" />
	<center>
		
	<f:form method="post" modelAttribute="uk" action="${myAction}">
	
		<table>
			<tr>
				<td>Please enter User Name:</td>
			</tr>
			<tr>
				<td><f:input path="username" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Delete User" /></td>
			</tr>
		</table>
	</f:form>
	
	</center>
<br>
<br>
<br>
<br>
 <b> <a href="homepage">HOME</a></b>
</body>
</html>