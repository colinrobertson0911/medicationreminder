<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Patient</title>
</head>
<body>
	<h2>Add a patient</h2>
	<f:form method="post" action="AddPatientSubmit" modelAttribute="patient">
		<div>
			<f:label path="username">User name:</f:label>
			<f:input path="username" type="text" required="required" size="30" maxlength="80" />
		</div>
		<div>
			<f:label path="password">Password:</f:label>
			<f:input path="password" type="password" required="required" size="30" maxlength="80" />
		</div>
		<div>
			<f:label path="name">Name:</f:label>
			<f:input path="name" type="text" required="required" size="30" />
		</div>
		<div>
			<f:label path="weight">Weight:</f:label>
			<f:input path="weight" type="text" required="required" size="10" />
		</div>
		<div>
			<f:label path="height">Height:</f:label>
			<f:input path="height" type="text" required="required" size="10" />
		</div>
		<div>
			<f:label path="age">Age:</f:label>
			<f:input path="age" type="number" required="required" />
		</div>
		<div>
			<f:label path="medication">Medication: </f:label>
			<f:select path="medication" items="${allMedication}" itemLabel="name" multiple="multiple" required="required"/>
		</div>
		<p>
			<input type="submit" value="Add" />
		</p>
	</f:form>
</body>
</html>