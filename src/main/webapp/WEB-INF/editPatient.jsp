<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Patient</title>
</head>
<body>
	<h2>Editing patient ${patient.username}</h2>
	<a href="Main" >Return To Main Page</a>
	<p> </p>
	<f:form method="post" action="EditPatientSubmit" modelAttribute="patient">
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
		<p>
			<input type="submit" value="Update" />
		</p>
		<f:hidden path="patientId" />
	</f:form>
</body>
</html>