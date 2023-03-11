<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home Page</title>
</head>
<body>
<c:if test="${option=='show' }">
<table border=1>

			<thead>
				<tr>
					<td>Company Name</td>
					
					
				</tr>
			</thead>
<c:forEach var="company" items="${company}">
			<tr>
			
				<td>${company.companyName }</td>
				
				
				<td>
				<a href = "updateCompany?companyName=${company.companyName}" >Edit</a>
				<a href = "deleteCompany?companyName=${company.companyName}" onclick = "if (!(confirm('Do you really want to delete this meeting record?'))) return false">Delete</a>
				</td>
			</tr>
		</c:forEach>
			
		
		</table>
		
		<h2> Add company </h2>
	
	<hr> <br>
	
	
	<a href="addCompany"> add company</a>
	</c:if>
	<c:if test="${option=='update' }">
	
	<form:form action="updateCompanyAct" method="post" modelAttribute="company">
	
	
	
	<label for="companyName">company name(*)</label>
	<form:input type="text" path="companyName" /> 
	
	
<input type="submit" value="submit" />
	</form:form><br><br>
	</c:if>
	<c:if test="${option=='add' }"><h2> Add company </h2>
	
	<hr> <br>
	
	<form:form action="addCompanyAct" method="post" modelAttribute="company">
	
	
	
	<label for="companyName">company name(*)</label>
	<form:input type="text" path="companyName" /> 
	
	
<input type="submit" value="submit" />
	</form:form><br><br></c:if>
</body>
</html>