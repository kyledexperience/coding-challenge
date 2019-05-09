<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div>

		<h1>Grow the web with referrals</h1>

		<form method="post">
			<span>Add a link: <input type="text" name="link" />
				<button type="submit">Add</button>
			</span>
		</form>


	</div>

	<table>
		<tr>
			<th>Link Title</th>
			<th>Clicks</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>


		<c:forEach var="w" items="${list}">
			<tr>
				<td>${w.title}</td>
				<td>${w.clicks}</td>
				<td>
				<a href="/edit/${w.id}">Edit</a>
				</td>
				<td>
				<a href="/delete/${w.id}">Delete</a>
				</td>

			</tr>

		</c:forEach>

	</table>


</body>
</html>