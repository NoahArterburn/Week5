<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Cats</title>
</head>
<body>
	<form action="updateCats" method="post">
		New Name: <input type="text" name="commonName" size="25" />
		New Breed Name: <input type="text" name="breedName" size="25" /> 
		New Average Size: <input type="text" name="avgSize" size="25" />
		Enter the current Cats name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>