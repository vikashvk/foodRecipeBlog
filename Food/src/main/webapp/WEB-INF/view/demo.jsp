<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Retrieve Recipe</title>
</head>
<body>
<center>
    <h2>GET Recipe</h2>
    <c:url var="myAction" value="serch" />
        
    <f:form method="post" modelAttribute="fr" action="${myAction}">
        <table>
            <tr>
                <td>Please enter Recipe Name:</td>
            </tr>
            <tr>
                <td><f:input path="recipeName" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Get Recipe Details" /></td>
            </tr>
        </table>
    </f:form>
    <br>
    
    <b> ${res}</b> <br>
    

    </center>
    <br>
<br>
<br>
<br>
 <b> <a href="homepage">HOME</a></b>
</body>
</html>