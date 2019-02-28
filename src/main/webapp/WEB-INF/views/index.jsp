<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css" />
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%@include file="partials/header.jsp" %>
	<h1>ticketmeister</h1>


<table>
<tr>
<th>Name</th><th>Genre</th><th>Price</th>
</tr>

<c:forEach var="show" items="${events }">
<tr>
<td>${show.name }</td><td>${show.genre }</td><td>${show.price }</td>
</tr>
</c:forEach>

</table>


</body>
</html>