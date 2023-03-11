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

	<form:form action="bookAct" method="post" modelAttribute="booking">
	
	<label for="Name">Name(*)</label>
	<form:input type="text" path="name" /> 
	 
	 <label for="mobileNo">Mobile No(*)</label>
	<form:input type="int" path="mobileNo" /> 
	
	<label for="email">Email(*)</label>
	<form:input type="text" path="email" /> 
	
	<label for="address">Address(*)</label>
	<form:input type="text" path="address" /> 
	
	<label for="noOfTickets">No. of Ticket(*)</label>
	<form:input type="text" path="noOfTickets" /> 
	
	<label for="password">Passcode(*)</label>
	<form:input type="text" path="password" /> 
	
<input type="submit" value="submit" />
	</form:form><br><br>

</body>
</html>