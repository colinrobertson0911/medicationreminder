<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>
<body>
	<div>
	<a href="Logout">Log out</a>
	</div>
	<div>
		<a href="AllMedication">All Medication</a>
	</div>
	<div>
		<a href="AllPatients">All Patients</a>
	</div>
	<div>
		<a href="MyMedication">My Medication</a>
	</div>
	<h1>Logged In</h1>
	<h3>Hello ${user.username}.</h3>
</body>
</html>