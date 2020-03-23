<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Patient</title>
</head>
<body>
	<h2>Editing user ${patient.username}</h2>

	<f:form method="post" action="EditPatientSubmit" modelAttribute="patient">
		<div>
			<f:label path="username">User name:</f:label>
			<f:input path="username" type="text" required="required" size="30" maxlength="80"/>
		</div>
		<div>
			<f:label path="password">Password:</f:label>
			<f:input path="password" type="password" required="required" size="30" maxlength="80"/>
		</div>
		<p>
			<input type="submit" value="Update"/>
		</p>
		<f:hidden path="id"/>
	</f:form>
</body>
</html>