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
	<p>${medication.patientid}</p>
	<div>
		<c:forEach items="${patient}" var="patient">
			<div>
				<a href="EditMedication?id=${medication.id}">${medication.name}</a>
			</div>
			<div>
				<label>Dosage: </label>
				${medication.dosage}
			</div>
			<div>
				<label>Condition: </label>
				${medication.condition}
			</div>
			<div>
				<label>Times A Week: </label>
				${medication.timesAWeek}
			</div>
			<div>
				<label>Times A Day: </label>
				${medication.timesADay}
			</div>
			<div>
				<label>Time To Take: </label>
				${medication.timeToTake}
			</div>
			<div>
				<label>Quantity: </label>
				${medication.quantity}
			</div>
			<div>
				<label>Pills Left: </label>
				${medication.pillsLeft}
			</div>
			<div>
				<label>Time to Refill</label>
				${medication.refill}
			</div>
			<div>
				<c:forEach items="${patient.medication}" var="patient">
					<div>${patient.name}</div>
				</c:forEach>
			</div>
		
		</c:forEach>
	</div>
	
</body>
</html>