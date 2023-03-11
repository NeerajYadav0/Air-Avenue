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
				<a href = "viewBooking?fno=${flightDetails.flightNo}" >View Booking</a>
			    </td>
				
			</tr>
		</c:forEach>
			
		
		</table>
		
		
	<script src="resources/script.js" charset="utf-8"></script>
</body>
</html>