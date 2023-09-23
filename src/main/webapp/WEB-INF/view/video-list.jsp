<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">TikTok</h1>
	
	<c:forEach var="video" items="${videos}">
		<h3>id</h3>
		${video.id}
		<br />
		<h3>Url</h3>
		${video.url}
		<br />
		<h3>Username</h3>
		${video.username}
		<br />
		<h3>Title</h3>
		${video.title}
		<br />
		<h3>Country</h3>
		${video.country}
		
	</c:forEach>
	

</body>
</html>