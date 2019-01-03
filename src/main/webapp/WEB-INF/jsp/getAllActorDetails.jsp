<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Actor</title>
</head>
<body>
	<table border="dotted">
		<caption>Get-All-Actor</caption>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
		</tr>
		<c:forEach items="${message}" var="actor">
			<tr>
				<td>${actor.id}</td>
				<td>${actor.name}</td>
				<td>${actor.age}</td>
				<td>${actor.gender}</td>
			</tr>
		</c:forEach>

	</table>

	<a href="index.html">Index</a>
</body>
</html>