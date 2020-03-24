<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Medication</title>
</head>
<body>
	<h2>Editing Medication</h2>
	<f:form method="post" action="EditMedicationSubmit" modelAttribute="medication">
		<div>
			<f:label path="name">Medication Name: </f:label>
			<f:input path="name" type="text" required="required" size="30" />
		</div>
		<div>
			<f:label path="dosage">Dosage: </f:label>
			<f:input path="dosage" type="text" required="required" size="10" />
		</div>
		<div>
			<f:label path="condition">Condition: </f:label>
			<f:input path="condition" type="text" required="required" size="30" />
		</div>
		<div>
			<f:label path="timesAWeek">Times A Week: </f:label>
			<f:input path="timesAWeek" type="number" required="required" size="1" />
		</div>
		<div>
			<f:label path="timesADay">Times A Day: </f:label>
			<f:input path="timesADay" type="number" required="required" size="1" />
		</div>
		<div>
			<f:label path="timeToTake">Time To Take: </f:label>
			<f:input path="timeToTake" type="datetime-local" name="timeToTake" />
		</div>
		<div>
			<f:label path="quantity">Quantity: </f:label>
			<f:input path="quantity" type="number" required="required" size="1" />
		</div>
		<div>
			<f:label path="pillsLeft">PillsLeft: </f:label>
			<f:input path="pillsLeft" type="number" required="required" size="3" />
		</div>
		<div>
			<f:hidden path="medicationId" />
		</div>
		<div>
			<input type="submit" value="update" />
		</div>
	</f:form>

</body>
</html>