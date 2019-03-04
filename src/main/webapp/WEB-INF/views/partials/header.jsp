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
<meta content="text/html; charset=UTF-8">
</head>

<header>

		<div id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/fav">Favorites</a>
				</li>
				<li><a class="nav-link dropdown-toggle" href="#"
					id="navbarDropdown" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> </a>

					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Keyword</a> <a
							class="dropdown-item" href="#">Genre</a> <a class="dropdown-item"
							href="#">Price</a>
					</div></li>
			</ul>

			<form class="form-inline my-2 my-lg-0">


				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>

			</form>
		</div>
	</nav>
</header>
</html>