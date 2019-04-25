<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recipe Information</title>
</head>
<body>
<center>

    <h2>Recipe Information</h2>


    <table border=1>
        <tr>
            <th>Recipe ID</th>
            <th>Recipe Name</th>
            <th>Cuisine Name</th>
            <th>Time to Prepare</th>
           <th>Veg or Not?</th>
        </tr>
        <c:forEach var="getAllRecipe" items="${rlist}">
            <tr>
                <td>${getAllRecipe.rId}</td>
                <td>${getAllRecipe.recipeName}</td>
                <td>${getAllRecipe.cuisine}</td>
                <td>${getAllRecipe.prepareTime}</td>
                <td>${getAllRecipe.veg}</td>
                
            </tr>
        </c:forEach>
        
            
    </table>
    </center>
<br>
<br>
<br>
<br>
 <b> <a href="homepage">HOME</a></b>
</body>
</html>