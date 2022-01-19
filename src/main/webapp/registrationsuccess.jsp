<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>success</title>
</head>
<body>
	<b> ADD TO-DO ITEM </b>
	<br><br>
	
	<form action="addToDo">
		<b>firstName</b><input type="text" name="firstName"><br>
		<b>Name</b><input type="text" name="Name"><br>
		<b>Description</b><input type="text" name="Description"><br>
		<b>Date-Time</b><input type="text" name="DateTime"><br>
		<b>Status</b><input type="text" name="Status"><br>
		<b>Category</b><input type="text" name="Category"><br>
		<input type="submit"><br>
	</form>
	
	<b> UPDATE TO-DO ITEM STATUS</b>
	<br><br>
	
	<form action="updateToDoStatus">
		<b>firstName</b><input type="text" name="firstName"><br>
		<b>Name</b><input type="text" name="Name"><br>
		<b>Status</b><input type="text" name="Status"><br>
		<input type="submit"><br>
	</form>
	
	<b> REMOVE TO-DO ITEM </b>
	<br><br>
	
	<form action="removeToDo">
		<b>firstName</b><input type="text" name="firstName"><br>
		<b>Name</b><input type="text" name="Name"><br>
		<input type="submit"><br>
	</form>
	
	
	<b> LOGOUT </b>
	<br><br>
	
	<form action="logout">
		<input type="submit"><br>
	</form>
	
	
</body>
</html>