<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Movie</title>
</head>
<body>
	<table border="dotted">
		<caption>Get-All-Movie</caption>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Type</th>
			<th>BoxOffice</th>
		</tr>
		<c:forEach items="${message}" var="movie">
			<tr>
				<td>${movie.id}</td>
				<td>${movie.name}</td>
				<td>${movie.type}</td>
				<td>${movie.boxoffice}</td>
			</tr>



		</c:forEach>

	</table>

	<a href="index.html">Index</a>
</body>
</html>