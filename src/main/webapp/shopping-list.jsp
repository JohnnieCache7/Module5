<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method="post" action="navigationServlet">
	<table>
		<c:forEach items="${requestScope.allitems}" var="currentitem">
		<tr>
			<td><input type="radio" name="id" value="${currentitem.id}"></td>
			<td>${currentitem.snack}</td>
			<td>${currentitem.price}</td>
		</tr>
		</c:forEach>
	</table>
	<input type="submit" value = "edit" name="doThisToSnack">
	<input type="submit" value = "delete" name="doThisToSnack">
	<input type="submit" value = "add" name="doThisToSnack">
	</form>
</body>
</html>