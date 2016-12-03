<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>


<p> <a href = "${pageContext.request.contextPath}/semesterscorerecord">학기별 이수 학점 조회</a>
<p> <a href = "${pageContext.request.contextPath}/divscorerecord">이수 구분별 학점 조회</a>
<p> <a href = "${pageContext.request.contextPath}/createscorerecord">수강 신청하기</a>
<p> <a href = "${pageContext.request.contextPath}/newscorerecord">수강 신청 조회</a>

</body>
</html>

