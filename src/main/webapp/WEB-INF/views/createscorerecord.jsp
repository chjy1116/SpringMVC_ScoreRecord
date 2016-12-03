<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>
	<sf:form method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="scorerecord">
		<table class="formtable">
			<tr>
				<td class="label">Year:</td>
				<td><sf:input class="control" path="year" type="text"/><br/>
				<sf:errors cssClass="error" path="year"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Semester:</td>
				<td><sf:input class="control" path="semester" type="text"/><br/>
				<sf:errors cssClass="error" path="semester"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Code:</td>
				<td><sf:input class="control" path="code" type="text"/><br/>
				<sf:errors cssClass="error" path="code"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Name:</td>
				<td><sf:input class="control" path="name" type="text"/><br/>
				<sf:errors cssClass="error" path="name"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Div:</td>
				<td><sf:input class="control" path="div" type="text"/><br/>
				<sf:errors cssClass="error" path="div"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Score:</td>
				<td><sf:input class="control" path="score" type="text"/><br/>
				<sf:errors cssClass="error" path="score"></sf:errors></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Create ScoreRecord" type="submit" /></td>
			</tr>
		</table>

	</sf:form>
</body>
</html>