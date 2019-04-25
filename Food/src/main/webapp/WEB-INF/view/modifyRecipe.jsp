<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Recipe</title>
</head>
<body>
<center><h2>Update Recipe details</h2></center>
    
 <center>       
<f:form method= "POST" action = "modifyRecipe" modelAttribute = "fr" >
<br>
Recipe Id: &nbsp;&nbsp; &nbsp;&nbsp;  &nbsp;&nbsp; 
<f:input type="text" path="rId" value="${fr.rId}"/>
<f:errors path="rId"></f:errors>
<br>
Recipe Name:  &nbsp;&nbsp; 
<f:input path = "recipeName" />
<f:errors path="recipeName" style="color:red" />
<br>
Cuisine Name: 
<f:input path = "cuisine"/>
<f:errors path="cuisine" style="color:red" />
<br>
Time to Prepare: &nbsp;&nbsp;  
<f:input path = "prepareTime"/>
<f:errors path="prepareTime" style="color:red" />
<br>
Veg or Not?: &nbsp;&nbsp;  
<f:input path = "veg"/>
<f:errors path="veg" style="color:red" />
<br>

<input type = "submit" value= "Add Recipe"/>


</f:form>
        
 Recipe :  <b> ${res.recipeName}</b><br>
 Cuisine : <h1> ${res.cuisine}</h1>
 Time To Prepare :  <h1> ${res.prepareTime}</h1>
</center>

<br>
<br>
<br>
<br>
 <b> <a href="homepage">HOME</a></b>
</body>
</html>