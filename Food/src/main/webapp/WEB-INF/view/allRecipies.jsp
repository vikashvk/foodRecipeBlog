<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe List</title>
</head>
<body>
	<center>

		<%
			String name = (String) session.getAttribute("usrnm");
			out.print("Hello User: You have entered the name: " + name);
		%>

		<f:form method="POST" action="getRecipies" modelAttribute="uk">

			<h2>Recipe List:</h2>

			<f:select path="recipeName">
				<option disabled selected>Select Recipe:</option>
				<c:forEach items="${rlist}" var="course">
					<option>
						<c:out value="${course}"></c:out>
					</option>
				</c:forEach>
			</f:select>

			<br>
			<input type="submit" value="Add Recipe" />

		</f:form>

	</center>

	<br>
	<br>
	<br>
	<br>
	<b> <a href="homepage">HOME</a></b>
</body>
</html>