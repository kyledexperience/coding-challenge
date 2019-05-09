<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<link rel="stylesheet" href="style.css" />

</head>
<body>

<form method="post">
<input type="text" name="title" value="${link.title}" placeholder="${link.title}"/>
<button type="submit">Update</button>


</form>

</body>
</html>