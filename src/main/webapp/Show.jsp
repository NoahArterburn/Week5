<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cats</title>
</head>
<body>
	List of all cats:
	<table>
		<c:forEach items="${requestScope.allcats}" var="currencat">
			<tr>
				<td>${currencat.name}|</td>
				<td>${currencat.breedName}|</td>
				<td>${currentcat.avgSize}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>