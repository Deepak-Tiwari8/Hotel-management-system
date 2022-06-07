package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ty.hotelmanagement.dto.Customer;
import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.dto.Room;
import com.ty.hotelmanagement.service.RoomService;
@WebServlet(value = "/getRoombyId")
public class GetRoomById extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String roomType = req.getParameter("roomType");
		LocalDateTime  checkIn = LocalDateTime.now();
		LocalDateTime  checkOut = LocalDateTime.now();
		double cost = Double.parseDouble(req.getParameter("cost"));
		Customer customer = new Customer();
		Hotel hotel = new Hotel();
		Room room = new Room();
		room.setRoomType(roomType);
		room.setCheckIn(checkIn);
		room.setCheckOut(checkOut);
		room.setCost(cost);
		
		RoomService roomservice = new RoomService();
		roomservice.getRoomById(1, hotel);
		if(roomservice!=null)
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("GetRoomById.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("employee.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
}
