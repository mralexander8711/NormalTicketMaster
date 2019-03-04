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
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<%@include file="partials/header.jsp"%>
	<div class="container">
	


		<c:forEach var="i" begin="1" end="1" items="${show.images }">
			<p style="text-align: center">
				<img src="${i.url}" class="img" alt="Event Image">
			</p>
		</c:forEach>

		<div class="container">

			<table class="table table-light">
			<thead>
				<tr>
					<th>Description</th>
					<th width="30%">Venue</th>
					<th>URL</th>
				</tr>
				</thead>
				<tbody>

				<tr>
					<td>${show.info}</td>
					<td><c:forEach var="i" items="${show.embedded2.venues}">
							${i.name }

						</c:forEach></td>
					<td><a href="${show.url}" target="_blank">Link</a></td>

				</tr>
				</tbody>
			</table>

		</div>
	</div>
</body>
</html>