<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment</title>
<style>
body{
	justify-items: center;
    display: grid;
}
div{
border:2px solid black;
border-radius:5px;
padding:10px;
display:grid;
justify-items: center;
}

</style>
</head>
<body>
	<div>
	<h2>Enter Information</h2>
	<form action='addPerson' method='post'>
	<input type='number' name='id' placeholder='Id'><br><br>
	<input type='text' name='name' placeholder='Name'><br><br>
	<button type='submit'>Submit</button>
	</form>
	<h3>${response}</h3>
	</div>
</body>
</html>