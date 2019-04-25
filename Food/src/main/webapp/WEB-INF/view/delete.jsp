<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete By ID</title>
</head>
<body>
	<center>
		<h2>DELETE Recipe</h2>
	</center>

	<c:url var="myAction" value="deleteRecipe" />

	<center>
		<f:form method="post" modelAttribute="fr" action="${myAction}">

			<table>
				<tr>
					<td>Please enter Recipies's ID:</td>
				</tr>
				<tr>
					<td><f:input path="rId" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Delete" /></td>
				</tr>
			</table>
		</f:form>
	</center>


	<h1>${res}</h1>

	<br>
	<br>
	<br>
	<br>
	<b> <a href="homepage">HOME</a></b>
</body>
</html>