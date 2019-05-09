<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kyle's Referrals</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="body">

		<h1>Grow the web with referrals!</h1>

		<form method="post">
			<span>Add a link: <input type="text" name="link" />
				<button type="submit">Add</button>
			</span>
		</form>




		<table class="table">
			<tr>
				<th>Link title</th>
				<th>Clicks</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>


			<c:forEach var="w" items="${list}">
				<tr>
					<td align="left">${w.title}</td>
					<td align="right">${w.clicks}</td>
					<td><a href="/edit/${w.id}">Edit</a></td>
					<td><a href="/delete/${w.id}">Delete</a></td>
					
				</tr>

			</c:forEach>

		</table>

	</div>


</body>
</html>