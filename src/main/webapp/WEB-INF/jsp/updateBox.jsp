<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Box Office</title>
</head>
<body>

	<form action="updateBoxOffice.html" method="post">
		${message}
		<h3>Add Movie</h3>
		<fieldset>
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="text" name="id"></td>
				</tr>

				<tr>
					<td>Updated Boxoffice:</td>
					<td><input type="text" name="boxoffice"></td>
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