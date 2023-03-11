<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#more {display: none;}
#initialDetails{display : "inline"})
</style>

</head>
<body>


<c:forEach var="SearchedFlight" items="${SearchedFlight}">
			
			
			
			 <div id="initialDetails">
				${SearchedFlight.company }
				${SearchedFlight.departureTime }
					${SearchedFlight.arrivalTime }
					</div>
					<span id="more">
				Company Name= &emsp;	${SearchedFlight.company } 
			Departure Time= &emsp; ${SearchedFlight.departureTime }
				Arrival Time= &emsp;	${SearchedFlight.arrivalTime }
					<br>
				Flight Number=&emsp;	${SearchedFlight.flightNo }
				No of Seats =&emsp;	${SearchedFlight.noOfSeats }
				Price= &emsp;	${SearchedFlight.cost }
					<br>
				To =&emsp;	${SearchedFlight.destination }
				From = &emsp;	${SearchedFlight.pickUp }
				Aircraft Name=&emsp;	${SearchedFlight.aircraftName }
					<br>
				Seats left=&emsp;	${SearchedFlight.seatsLeft }
				Booked Seats =&emsp;	${SearchedFlight.bookedSeats }
				Date =&emsp;	${SearchedFlight.date }
				<br>
					
				
				
				<a href = "bookTicket?flightNo=${SearchedFlight.flightNo}" >Book Ticket</a>
				
			</span>
				<button onclick="GetDetails()" id="myBtn">Get Details</button>
			
		</c:forEach>
		<script type="text/javascript">
		function GetDetails()
		{  
			 var init = document.getElementById("initialDetails");
		  var moreText = document.getElementById("more");
		  var btnText = document.getElementById("myBtn");

		  if (init.style.display === "none") {
		    init.style.display = "inline";
		    btnText.innerHTML = "More Details"; 
		    moreText.style.display = "none";
		  } else {
		    init.style.display = "none";
		    btnText.innerHTML = "Less Details"; 
		    moreText.style.display = "inline";
		  }
		}
		
		</script>
	<script src="resources/script.js" charset="utf-8"></script>	
</body>
</html>