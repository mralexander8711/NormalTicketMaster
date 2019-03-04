<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css" />
<meta content="text/html; charset=UTF-8">
<title>Search</title>
</head>
<body>
	<%@include file="partials/header.jsp"%>

	<div class="container">

		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>URL</th>
				</tr>

			</thead>
			<tbody>

				<c:forEach var="show" items="${events }">
					<tr>
						<td>${show.name }</td>
						<td>${show.info }</td>
						<td><a href="${show.url}" target="_blank">Link</a></td>
					</tr>
				</c:forEach>


			</tbody>
		</table>
	</div>



</body>
</html>