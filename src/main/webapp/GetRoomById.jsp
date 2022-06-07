<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="getRoombyId" method="post">
roomType: <input type="text" name="roomType">
checkIn :<input type="datetime" name="checkIn">
checkOut : <input type="datetime" name="checkOut">
cost : <input type="number" name="cost">
View <input type="submit" name="view">
</form>
</body>
</html>