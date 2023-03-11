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
<c:forEach var="book" items="${book}" >
			<tr>
			
				<td>${book.name }</td>
				<td>${book.email }</td>
				<td>${book.address }</td>
				<td>${book.noOfTickets }</td>
				<td>${book.flightNo }</td>
				<td>${book.mobileNo }</td>
				<td>${book.bookingId }</td>
		        <c:if test="${book.activeFlight==false }">
		        
		        <td>your flight has been cancelled</td>
		     <td>   <a href = "cancel?flightNo=${book.flightNo}&bookingId=${book.bookingId}&email=${book.email}" >Delete Record</a></td>
		        </c:if>
		        
		         <c:if test="${book.activeFlight==true }">
		        
		      <td>
				<a href = "generateTicket?flightNo=${book.flightNo}&bookingId=${book.bookingId}" >Generate Ticket</a>
				<a href = "cancel?flightNo=${book.flightNo}&bookingId=${book.bookingId}&email=${book.email}" onclick = "if (!(confirm('Do you really want to delete this meeting record?'))) return false">Cancel ticket</a>
				</td>
		        
		        </c:if>
				
				
				
			</tr>
		</c:forEach>
			
		
		</table>


</body>
</html>