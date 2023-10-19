<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Cat</title>
</head>
<body>


	<form action="updatecats" method="post">
		New Name: <input type="text" name="Name" size="25" />
		New Breed Name: <input type="text" name="breedName" size="25" /> 
		New Average Size: <input type="text" name="avgSize" size="25" />
		Enter the current Cat name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>