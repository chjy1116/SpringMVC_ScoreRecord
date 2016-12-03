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
				<td class="label_center">전기</td><td class="label_center">전선</td><td class="label_center">전지</td>
				<td class="label_center">교필</td><td class="label_center">핵교A</td><td class="label_center">핵교B</td>
				<td class="label_center">일교</td><td class="label_center">총학점</td>
			</tr>
			<tr>
				<td class="label_center">${d1}</td><td class="label_center">${d2}</td><td class="label_center">${d3}</td>
				<td class="label_center">${d4}</td><td class="label_center">${d5}</td><td class="label_center">${d6}</td>
				<td class="label_center">${d7}</td><td class="label_center">${sum}</td>
			</tr>
		</table>

	<form>
</body>
</html>