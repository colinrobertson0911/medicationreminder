<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Patients</title>
</head>
<body>
	<h2>All Patients</h2>
	<a href="Main" >Return To Main Page</a>
	<p> </p>
	<div>
		<c:forEach items="${allPatients}" var="patient">
			<div>
				<a href="EditPatient?id=${patient.patientId}">${patient.username }</a>
			</div>	
		</c:forEach>
	</div>
	<form action="AddPatient">
		<p><input type="submit" value="Add a Patient"/></p>
	</form>
</body>
</html>