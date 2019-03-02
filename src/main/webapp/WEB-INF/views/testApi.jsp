<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Testing The Api</title>
</head>
<body>

<!-- Code that worked for pulling image links from API

<p>Testing Image call.</p>
<table>
<thead>
<tr>
<th>Image Test</th>
</tr>
</thead>
<c:forEach var="show" items="${events }">

<c:forEach var="images" items="${show.images }">
<tr>
<td>${images.url }</td>

</tr>
</c:forEach>

</c:forEach>
</table>

  -->

<p>Testing Genre call.</p>
<table>
<thead>
<tr>
<th>Genre Test</th>
</tr>
</thead>
<c:forEach var="show" items="${events }">

<c:forEach var="classifications" items="${show.classifications }">

<tr>
<td>${classifications.genre.name}</td>

</tr>

</c:forEach>
</c:forEach>
</table>

</body>
</html>