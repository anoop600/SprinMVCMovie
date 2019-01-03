<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Actor</title>
</head>
<body>
	<form action="addActor.html" method="post">
		${message}
			<h3>Add Actor</h3>
		<fieldset>
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input type="text" name="gender"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Confirm & Checkout"></td>
				</tr>

			</table>
		</fieldset>
	</form>
</body>
</html>