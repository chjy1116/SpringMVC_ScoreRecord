<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table class="form1">
			<tr>
				<td class="label_center">년도</td><td class="label_center">학기</td><td class="label_center">이수학점</td><td class="label_center">상세보기</td></tr>
			<tr>
				<td class="label_center">2014</td><td class="label_center">1</td><td class="label_center">${y1}</td><td class="label_center"><a href = "${pageContext.request.contextPath}/first">링크</td>
			</tr>
			<tr>
				<td class="label_center">2014</td><td class="label_center">2</td><td class="label_center">${y2}</td><td class="label_center"><a href = "${pageContext.request.contextPath}/second">링크</td>
			</tr>
			<tr>
				<td class="label_center">2015</td><td class="label_center">1</td><td class="label_center">${y3}</td><td class="label_center"><a href = "${pageContext.request.contextPath}/third">링크</td>
			</tr>
			<tr>
				<td class="label_center">2015</td><td class="label_center">2</td><td class="label_center">${y4}</td><td class="label_center"><a href = "${pageContext.request.contextPath}/fourth">링크</td>
			</tr>
			<tr>
				<td class="label_center">2016</td><td class="label_center">1</td><td class="label_center">${y5}</td><td class="label_center"><a href = "${pageContext.request.contextPath}/fifth">링크</td>
			</tr>
		</table>

	<form>
</body>
</html>