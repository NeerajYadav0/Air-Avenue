<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>enter your details</h1>

<form:form action="ticketsAct" method="post" modelAttribute="bookingLogin">
	
	
	
	<label for="userName">User Name(*)</label>
	<form:input type="text" path="userName" /> 
	
	<label for="password">Passcode(*)</label>
	<form:input type="text" path="password" /> 
	
	
<input type="submit" value="submit" />
	</form:form><br><br>
</body>
</html>