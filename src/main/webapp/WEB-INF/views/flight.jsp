<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
</head>
<body>
<c:if test="${option=='show' }">
<table border=1>

			<thead>
				<tr>
					<td>Flight number</td>
					<td>No of Seats</td>
					<td>Cost</td>
					<td>Destination</td>
					<td>From</td>
					<td>Company</td>
					<td>Aircraft Name</td>
					<td>Seats Left</td>
					<td>Booked Seats</td>
					<td>Departure Time</td>
					<td>Arrival Time</td>
					<td>Date</td>
					
				</tr>
			</thead>
<c:forEach var="flightDetails" items="${flightDetails}">
			<tr>
			
				<td>${flightDetails.flightNo }</td>
				<td>${flightDetails.noOfSeats }</td>
				<td>${flightDetails.cost }</td>
				<td>${flightDetails.destination }</td>
				<td>${flightDetails.pickUp }</td>
				<td>${flightDetails.company }</td>
				<td>${flightDetails.aircraftName }</td>
				<td>${flightDetails.seatsLeft }</td>
				<td>${flightDetails.bookedSeats }</td>
				<td>${flightDetails.departureTime }</td>
				<td>${flightDetails.arrivalTime }</td>
				<td>${flightDetails.date }</td>			
				
				<td>
				<a href = "updateFlight?fno=${flightDetails.flightNo}" >Edit</a>
				<a href = "deleteFlight?fno=${flightDetails.flightNo}" onclick = "if (!(confirm('Do you really want to delete this meeting record?'))) return false">Delete</a>
				</td>
				
			</tr>
		</c:forEach>
			
		
		</table>
		
		<h2> Add Flight Details </h2>
	
	<hr> <br>
	
	
	<a href="addFlight"> add Flight</a>
	</c:if>
	
	
	
	
	<c:if test="${option=='add' }">
	<hr> <br>
	
	<form:form action="addFlightAct" method="post" modelAttribute="flightDetails">
	
	
	
	<label for="flightNo">Flight No(*)</label>
	<form:input type="int" path="flightNo" />  <br><br>
	
	<label for="noOfSeats">Number of Seats(*)</label>
	<form:input type="int" path="noOfSeats" /> <br><br>
	
	<label for="cost">cost(*)</label>
	<form:input type="int" path="cost" /> <br><br>
	
	<label for="destination">Destination(*)</label>
	<form:select path="destination">
    <form:option value="0" label="Select an Option" />
    <form:options items="${flightDetails.airportOptions}" />
</form:select>
<br><br>

	<label for="pickUp">Pick UP Point(*)</label>
	<form:select path="pickUp">
    <form:option value="0" label="Select an Option" />
    <form:options items="${flightDetails.airportOptions}" />
</form:select>
<br><br>
  
	<label for="company">company(*)</label>
	<form:select path="company">
    <form:option value="0" label="Select an Option" />
    <form:options items="${flightDetails.companyOptions}" />
</form:select>
	
	 <br><br>
	
	<label for="aircraftName">Aircraft Name(*)</label>
	<form:input type="text" path="aircraftName" />
	<br><br>
	<label for="seatsLeft">Number of seats left(*)</label>
	<form:input type="int" path="seatsLeft" /> 
	<br><br>
	<label for="bookedSeats">Number seats Booked(*)</label>
	<form:input type="int" path="bookedSeats" />  
	<br><br>
	<label for="departureTime">Departure Time(*)</label>
	<form:input type="text" path="departureTime" />
	<br><br>
	<label for="arrivalTime">ArrivalTime(*)</label>
	<form:input type="text" path="arrivalTime" />
	<br><br>
	<label for="date">date(*)</label>
	<form:input type="text" id="date" path="date" />         
	<br><br>
	
<input type="submit" value="submit" />
	</form:form><br><br>
	
	
	</c:if>
	<c:if test="${option=='update' }">
	<form:form action="updateFlightAct" method="post" modelAttribute="flightDetails">
	
	
	
	<label for="flightNo">Flight No(*)</label>
	<form:input type="int" path="flightNo" value="${fli.flightNo }"/>  <br><br>
	
	<label for="noOfSeats">Number of Seats(*)</label>
	<form:input type="int" path="noOfSeats" value="${fli.noOfSeats }"/> <br><br>
	
	<label for="cost">cost(*)</label>
	<form:input type="int" path="cost" value="${fli.cost }"/> <br><br>
	
	<label for="destination">Destination(*)</label>
	<form:select path="destination">
    <form:option value="0" label="Select an Option" />
    <form:options items="${flightDetails.airportOptions}" />
</form:select>
<br><br>

	<label for="pickUp">Pick UP Point(*)</label>
	<form:select path="pickUp">
    <form:option value="0" label="Select an Option" />
    <form:options items="${flightDetails.airportOptions}" />
</form:select>
<br><br>
  
	<label for="company">company(*)</label>
	<form:select path="company">
    <form:option value="0" label="Select an Option" />
    <form:options items="${flightDetails.companyOptions}" />
</form:select>
	
	 <br><br>
	
	<label for="aircraftName">Aircraft Name(*)</label>
	<form:input type="text" path="aircraftName" value="${fli.aircraftName }"/>
	<br><br>
	<label for="seatsLeft">Number of seats left(*)</label>
	<form:input type="int" path="seatsLeft" value="${fli.seatsLeft }"/> 
	<br><br>
	<label for="bookedSeats">Number seats Booked(*)</label>
	<form:input type="int" path="bookedSeats" value="${fli.bookedSeats }"/>  
	<br><br>
	<label for="departureTime">Departure Time(*)</label>
	<form:input type="text" path="departureTime" value="${fli.departureTime }"/>
	<br><br>
	<label for="arrivalTime">ArrivalTime(*)</label>
	<form:input type="text" path="arrivalTime" value="${fli.arrivalTime }"/>
	<br><br>
	<label for="date">date(*)</label>
	<form:input type="text" id="date" path="date" value="${fli.date }"/>         
	<br><br>
	
<input type="submit" value="submit" />
	</form:form><br><br>
	
	</c:if>
	<script src="resources/script.js" charset="utf-8"></script>
</body>
</html>