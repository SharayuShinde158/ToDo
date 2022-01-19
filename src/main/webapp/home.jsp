<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Home</title>
</head>
<body>
	<b> NEW USER </b><br>
	<form action="addClient">
		<b>firstName</b><input type="text" name="firstName"><br>
		<b>lastName</b><input type="text" name="lastName"><br>
		<b>emailId</b><input type="text" name="emailId"><br>
		<b>MobileNumber</b><input type="text" name="MobileNumber"><br>
		<b>Gender</b><input type="text" name="Gender"><br>
		<b>Birthday</b><input type="text" name="Birthday"><br>
		<input type="submit"><br>
	</form>
	<br>
	<b> EXISTING USER </b><br>
	<form action="login">
		<br><b>Enter login credentials and submit to login</b><br>
		<b>firstName</b><input type="text" name="firstName"><br>
		<input type="submit"><br>
	</form>
</body>
</html>