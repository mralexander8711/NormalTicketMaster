<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>


<table>
<tr>
<th>Image Test</th>
</tr>
<c:forEach var="show" items="${events }">

<c:forEach var="images" items="${show.images }">
<tr>
<td>${images.url }</td>

</tr>
</c:forEach>

</c:forEach>


<c:forEach var="show" items="${events }">

<c:forEach var="classifications" items="${show.classifications }">

<tr>
<td>${classifications.genre.name}</td>

</tr>

</c:forEach>
</c:forEach>

<c:forEach var="show" items="${events }">

<c:forEach var="venues" items ="${show.embedded2.venues }">

<tr>
<td>${venues.name}</td>

</tr>

</c:forEach>
</c:forEach>
</table>


</body>
</html>