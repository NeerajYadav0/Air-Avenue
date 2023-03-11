<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border=1>

			<thead>
				<tr>
					<td>Flight number</td>
					<td>Cost</td>
					<td>Destination</td>
					<td>From</td>
					<td>Company</td>
					<td>Aircraft Name</td>
					<td>Departure Time</td>
					<td>Arrival Time</td>
					<td>Date</td>
					
				</tr>
			</thead>
			<tr>
			
				<td>${flightDetails.flightNo }</td>
				<td>${flightDetails.cost }</td>
				<td>${flightDetails.destination }</td>
				<td>${flightDetails.pickUp }</td>
				<td>${flightDetails.company }</td>
				<td>${flightDetails.aircraftName }</td>
				<td>${flightDetails.departureTime }</td>
				<td>${flightDetails.arrivalTime }</td>
				<td>${flightDetails.date }</td>			
				
				
			</tr>
				</table>
				
				<br>
		<table border=1>

			<thead>
				<tr>
				
					<td>Name</td>
					<td>Email</td>
					<td>Address</td>
					<td>No Of Tickets </td>
					<td>FlightNo</td>
					<td>Phone No</td>
					<td>Booking Id</td>
					
				</tr>
			</thead>

			<tr>
			
				<td>${book.name }</td>
				<td>${book.email }</td>
				<td>${book.address }</td>
				<td>${book.noOfTickets }</td>
				<td>${book.flightNo }</td>
				<td>${book.mobileNo }</td>
				<td>${book.bookingId }</td>
		
				
			</tr>
		
		
		</table>
			
		<h2>total amount to be paid at counter- </h2>  <h2> ${amount} </h2> 
	
</body>
</html>