<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addroom" method="post">
<h1>Add Room</h1>
roomType : <input type="text" name="roomType"><br><br>
checkIn : <input type="datetime-local" name="checKIn"><br><br>
checkOut : <input type="datetime-local" name="checKOut"><br><br>
cost : <input type="number" name="cost"><br><br>
<input type="submit" name="Add">
</form> 
</body>
</html>