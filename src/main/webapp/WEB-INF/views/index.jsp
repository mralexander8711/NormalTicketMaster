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
<title>Home</title>
</head>
<body>

<%@include file="partials/header.jsp"%>
	<div class="container">
		

		<h1 class="display-1">ticketmeister</h1>

		<div id="demo" class="carousel slide" data-ride="carousel">

			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
			</ul>

			<!-- The slideshow -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img
						src="https://s1.ticketm.net/dam/a/1dd/d5e86d93-5e1a-49d9-b530-70fefc0f21dd_877061_TABLET_LANDSCAPE_3_2.jpg"
						alt="Los Angeles">
				</div>
				<div class="carousel-item">
					<img
						src="https://s1.ticketm.net/dam/a/433/7980a1b3-95ab-4b66-b793-4d0aa8dca433_655411_TABLET_LANDSCAPE_LARGE_16_9.jpg"
						alt="Chicago">
				</div>
				<div class="carousel-item">
					<img
						src="https://s1.ticketm.net/dam/a/507/071f2b5a-e768-4315-8d45-120ad5d07507_444371_RETINA_LANDSCAPE_16_9.jpg"
						alt="New York">
				</div>
				<div class="carousel-item">
					<img
						src="https://s1.ticketm.net/dam/a/d98/7feb06e4-0dab-4207-868b-d6e29285bd98_984001_RETINA_LANDSCAPE_16_9.jpg"
						alt="New York">
				</div>
				<div class="carousel-item">
					<img
						src="https://s1.ticketm.net/dam/a/622/e77943be-4b22-4319-8993-dc9d5fc0c622_984531_TABLET_LANDSCAPE_16_9.jpg"
						alt="New York">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>

		</div>

		<table class="table table-dark table-striped">
			<thead class="thead-light">
				<tr>
					<th width="45%">Name</th>
					<th width="20%">Genre</th>
					<th width="10%">URL</th>
					<th width="20%">Price</th>
					<th width="15%">Favorite</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="show" items="${events }">

					<tr>
						<td>
							<form method="get">

								${show.name } <a href="/details/${show.id}" type="submit">Details</a>

							</form>
						</td>

						<td><c:forEach var="classifications"
								items="${show.classifications}">
${classifications.genre.name}
</c:forEach></td>


						<td><a href="${show.url}" target="_blank">Link</a></td>

						<td><c:forEach var="price" items="${show.priceRanges }">
								<fmt:formatNumber type="currency" value="${price.min } " />
&nbsp;-&nbsp;<fmt:formatNumber type="currency" value="${price.max } " />
								<br>
							</c:forEach></td>


						<td><a href="" type="button" class="btn btn-outline-light">FAVE</a>
						</td>


					</tr>
				</c:forEach>
			</tbody>
		</table>



	</div>
	<!-- BOOTSTRAP -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>


</body>
</html>