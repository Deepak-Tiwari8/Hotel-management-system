package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Room;
import com.ty.hotelmanagement.service.RoomService;
@WebServlet(value = "")
public class GetAllRoom  extends HttpServlet
 {
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  RoomService roomservice = new RoomService();
	  List<Room> rooms = roomservice.getAllRooms();
	  if(rooms!=null)
	  {
		  RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllRoom.jsp");
		  requestDispatcher.forward(req, resp); 
	  }
	  else
	  {
        resp.sendRedirect("adminHome.jsp");
	  }
}
}
