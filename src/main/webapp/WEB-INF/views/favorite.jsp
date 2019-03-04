<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bucket List</title>
</head>
<body>
	<%@include file="partials/header.jsp"%>
	<div class="container">

		<h1 class="display-2">Favorites</h1>

		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Details</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="show" items="${events}">
					<tr>
						<td>${show.name}</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>
	</div>