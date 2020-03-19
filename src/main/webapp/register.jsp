<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register for Medication Reminder</title>
</head>
<body>
	<h1>Registration Page</h1>
	<h3>Enter your details</h3>
	<div>
		<form action="RegisterSubmit" method="post">
			${errorMessage}
			<div>
				<label>Username:</label>
				<input type="text" name="username"/>
			</div>
			<div>
				<label>Password</label>
				<input type="password" name="password"/>
			</div>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>