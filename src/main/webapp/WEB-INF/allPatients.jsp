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
	<p>
		<a href="AddPatient">Add new Patient</a>
	</p>
	<div>
		<c:forEach items="${allPatients}" var="patient">
			<div>
				<a href="EditPatient?id=${patient.id}">${patient.username }</a>
			</div>
			<div>
				<label>Name: </label>
				${patient.name}
			</div>
			<div>
				<label>Weight: </label>
				${patient.weight}
			</div>
			<div>
				<label>Height: </label>
				${patient.height}
			</div>
			<div>
				<label>Age: </label>
				${patient.age}
			</div>
			<%-- <div>
				<c:forEach items="${patient.medication}" var="medication">
					<div>${medication.medication}</div>
				</c:forEach>
			</div> --%>
			
		</c:forEach>
	</div>
</body>
</html>