<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
 --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>All Medication</title>
</head>
<body>
	<h2>All Medication</h2>
	<p>
		<a href="AddMedication">Add new Medication</a>
	</p>
	<div>
		<c:forEach items="${allMedication}" var="medication">
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
			</div>
		</c:forEach>
	</div>
</body>
</html>