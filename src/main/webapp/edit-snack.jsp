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
	<form action = "/WebVendingMachine/editSnackServlet" method="post">
	Snack: <input type = "text" name="snack" value="${snackToEdit.snack}">
	Price: <input type = "text" name="price" value="${snackToEdit.price}">
	<input type = "hidden" name="id" value="${snackToEdit.id}">
	<input type = "submit" value="Save Edited Snack">
	</form>

</body>
</html>