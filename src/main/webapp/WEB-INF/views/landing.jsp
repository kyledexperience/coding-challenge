<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Landing</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>

<div class="body">

	<c:set var="string1" value="${title}" />
	<c:set var="string2" value="${fn:toUpperCase(string1.charAt(0))}" />

	<p>${string2}${string1.substring(1)} are awesome!</p>
	<p>Come join Kyle's World Wide Web!</p>
	<img src="https://img.maximummedia.ie/her_ie/eyJkYXRhIjoie1widXJsXCI6XCJodHRwOlxcXC9cXFwvbWVkaWEtaGVyLm1heGltdW1tZWRpYS5pZS5zMy5hbWF6b25hd3MuY29tXFxcL3dwLWNvbnRlbnRcXFwvdXBsb2Fkc1xcXC8yMDE5XFxcLzAzXFxcLzE0MDgzOTQ3XFxcL2R1LnBuZ1wiLFwid2lkdGhcIjo3NjcsXCJoZWlnaHRcIjo0MzEsXCJkZWZhdWx0XCI6XCJodHRwczpcXFwvXFxcL3d3dy5oZXIuaWVcXFwvYXNzZXRzXFxcL2ltYWdlc1xcXC9oZXJcXFwvbm8taW1hZ2UucG5nP2lkPWI2M2IwNzFiMTNhMGQ5NGVjNjEzXCIsXCJvcHRpb25zXCI6W119IiwiaGFzaCI6Ijg1MWJjMGRiMTAzZjM5NGZkYmZmYWQ4OTA2NGIxZWRkNGZiY2Y3OTAifQ==/du.png" />


	<br>
	<a href="/">Back</a>
</div>
</body>
</html>