<%@page import="java.util.List"%>
<%@page import="com.ty.hotelmanagement.dto.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>List of rooms</h1>
<%
List<Room> rooms = (List<Room>request.getAttribute("deepak"));
if(!(rooms.isEmpty()))
		{
%>

<table border="2px" cellpadding=10px>
<tr>
<th> ID </th>
<th>RoomType</th>
<th>CheckIn</th>
<th>CheckOut</th>
<th>Cost</th>
<th>Book</th>
<th>Delete</th>
</tr>
<%
for(Room room : rooms)
{
%>
<tr> 
<td> <%=room.getId() %></td>
<td> <%=room.getRoomType() %></td>
<td> <%=room.getCheckIn() %></td>
<td> <%=room.geCheckOut()%></td>
<td> <%=room.getCost() %></td>
<td> <a href ="BookedRoom.jsp"> Book</a></td>
</tr>

<%
}
		}
%>

</table>
</body>
</html>