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
<c:if test="${option=='show' }">
<table border=1>

			<thead>
				<tr>
					<td>AirPort Name</td>
					<td>AirPort Location</td>
					<td>Options</td>
				</tr>
			</thead>
<c:forEach var="airport" items="${airport}">
			<tr>
			
				<td>${airport.aName }</td>
				<td>${airport.location }</td>
				
				<td>
				<a href = "updateAirport?name=${airport.aName}" >Edit</a>
				<a href = "deleteAirport?name=${airport.aName}" onclick = "if (!(confirm('Do you really want to delete this meeting record?'))) return false">Delete</a>
				</td>
				
			</tr>
		</c:forEach>
			
		
		</table>
		
		<h2> Add Airport </h2>
	
	<hr> <br>
	
	
	<a href="addAirport"> add Airport</a>
	</c:if>
	<c:if test="${option=='update' }">
	
	<form:form action="updateAirportAct" method="post" modelAttribute="airport">
	
	
	
	<label for="aName">AirPort name(*)</label>
	<form:input type="text" path="aName" /> 
	
	<label for="location">AirPort Location(*)</label>
	<form:input type="text" path="location" /> 
	
	
<input type="submit" value="submit" />
	</form:form><br><br>
	</c:if>
	
	<c:if test="${option=='add' }"><h2> Add AirPort </h2>
	
	<hr> <br>
	
	<form:form action="addAirportAct" method="post" modelAttribute="airport">
	
	
	
	<label for="aName">AirPort name(*)</label>
	<form:input type="text" path="aName" /> 
	
	<label for="location">AirPort Location(*)</label>
	<form:input type="text" path="location" /> 
	
	
<input type="submit" value="submit" />
	</form:form><br><br></c:if>
	
</body>
</html>