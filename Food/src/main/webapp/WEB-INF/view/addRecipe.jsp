<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
  <%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Taste </title>
</head>
<body>
<center><h1>Enter Recipe details</h1></center>
	
<center>		
<f:form method= "POST" action = "getRecipeData" modelAttribute = "fr" >

Recipe Name:&nbsp;&nbsp;&nbsp;
<f:input path = "recipeName" required="required" />
<f:errors path="recipeName"  style="color:red" />
<br>
Cuisine : 
<f:input path = "cuisine"/>
<f:errors path="cuisine" style="color:red" />
<br>
Time to Prepare: &nbsp;&nbsp;&nbsp;
<f:input path = "prepareTime"/>
<f:errors path="prepareTime" style="color:red" />
<br>
Veg : &nbsp;&nbsp;&nbsp;
<f:input path = "veg"/>
<f:errors path="veg" style="color:red" />
<br>
<input type = "submit" value= "Add Recipe"/>


</f:form>
</center>
		
		 ${res}
		 <br><br>
		 <b> <a href="homepage">HOME</a></b>

</body>
</html>