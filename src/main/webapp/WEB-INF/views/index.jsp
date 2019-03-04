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
		
		<!-- NEW -->

		        <div id="demo" class="carousel slide" data-ride="carousel">
            <!-- Indicators-->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
                <li data-target="#demo" data-slide-to="3"></li>
                <li data-target="#demo" data-slide-to="4"></li>
            </ul>
            <!-- The slideshow -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img
                        src=https://s1.ticketm.net/dam/a/d98/7feb06e4-0dab-4207-868b-d6e29285bd98_984001_RETINA_LANDSCAPE_16_9.jpg>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>MONSTER JAM</h5>
                        <p>Sun • Mar 03 • 3:00 PM Sun Bowl Stadium, El Paso, TX</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img
                        src=https://s1.ticketm.net/dam/a/1dd/d5e86d93-5e1a-49d9-b530-70fefc0f21dd_877061_RETINA_LANDSCAPE_16_9.jpg>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>P!NK - Beautiful Trauma World Tour</h5>
                        <p>Tue 25 Jun 2019 @ 5:30 pm | Anfield, Liverpool</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img
                        src=https://s1.ticketm.net/dam/a/433/7980a1b3-95ab-4b66-b793-4d0aa8dca433_655411_RETINA_LANDSCAPE_16_9.jpg>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>MEGA MEZCLA 2019</h5>
                        <p>Sun • Apr 21 • 8:00 PM Prudential Center, Newark, NJ</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img
                        src=https://s1.ticketm.net/dam/a/300/88bcb3d0-aa78-428d-ad10-52514ea72300_570131_RETINA_LANDSCAPE_16_9.jpg>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>HAMILTON (Touring)</h5>
                        <p>Tue • Apr 02 • 7:30 PM Music Hall At Fair Park, Dallas, TX</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img
                        src=https://s1.ticketm.net/dam/c/2f4/a86f0e97-a943-4a8a-8826-2eaea82e92f4_106291_RETINA_LANDSCAPE_16_9.jpg>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>PGA MASTERS TOUR</h5>
                        <p>Mon-Sun• Apr 08- Apr 14 • Augusta, GA</p>
                    </div>
                </div>
                <!-- Left and right controls -->
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a> <a class="carousel-control-next" href="#demo" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>
            </div>
		<!-- OLD -->

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