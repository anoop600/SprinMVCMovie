<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Genre</title>
</head>
<body>
	<table border="dotted">
	<caption>Get-All-Genre</caption>
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<c:forEach items="${message}" var="genre">
			<tr>
				<td>${genre.id}</td>
				<td>${genre.name}</td>
			</tr>



		</c:forEach>

	</table>

	<a href="index.html">Index</a>
</body>
</html>