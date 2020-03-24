<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>My Medication</title>
</head>
<body>
	<h2>My Medication</h2>
	<p>
		<a href="AddMedication">Add new Medication</a>
	</p>

	<div>
		<c:forEach items="${allMedication}" var="patient">
			<div>
				<a href="EditMedication?id=${medication.id}">${patient.name}</a>
			</div>
			<div>
				<label>Name: </label>
				${patient.name}
			</div>
			<div>
				<label>Dosage: </label>
				${patient.dosage}
			</div>
			<div>
				<label>Condition: </label>
				${patient.condition}
			</div>
			<div>
				<label>Times A Week: </label>
				${patient.timesAWeek}
			</div>
			<div>
				<label>Times A Day: </label>
				${patient.timesADay}
			</div>
			<div>
				<label>Time To Take: </label>
				${patient.timeToTake}
			</div>
			<div>
				<label>Quantity: </label>
				${patient.quantity}
			</div>
			<div>
				<label>Pills Left: </label>
				${patient.pillsLeft}
			</div>
			<div>
				<label>Time to Refill</label>
				${patient.refill}
			</div>
			<div>
			
			</div>
		
		</c:forEach>
	</div>
	
</body>
</html>