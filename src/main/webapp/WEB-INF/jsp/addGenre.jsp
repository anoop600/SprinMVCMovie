<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Genre</title>
</head>
<body>
	<form action="addGenre.html" method="post">
		${message}
		<h3>Add Genre</h3>
		<fieldset>
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
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