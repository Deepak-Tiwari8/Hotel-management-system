package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Room;
import com.ty.hotelmanagement.service.RoomService;

@WebServlet(value = "/addroom")
public class AddRoom extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String roomType = req.getParameter("roomType");
		LocalDateTime checkIn = LocalDateTime.now();
		LocalDateTime checkOut = LocalDateTime.now();
		double cost = Double.parseDouble(req.getParameter("cost"));
		
		
		Room room1 = new Room();
		room1.setRoomType(roomType);
		room1.setCheckIn(checkIn);
		room1.setCheckOut(checkOut);
		room1.setCost(cost);
		
		Room room2 = new Room();
		room2.setRoomType(roomType);
		room2.setCheckIn(checkIn);
		room2.setCheckOut(checkOut);
		room2.setCost(cost);
		
		
		Room room3 = new Room();
		room3.setRoomType(roomType);
		room3.setCheckIn(checkIn);
		room3.setCheckOut(checkOut);
		room3.setCost(cost);
		
		List<Room> roomss = new ArrayList<Room>();
		roomss.add(room1);
		roomss.add(room2);
		roomss.add(room3);
		
		RoomService roomService = new RoomService();
		Room rooms = roomService.addRoom(room1);
		if(roomss!=null)
		{
			System.out.println("add Room Successfully ");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("addRoom.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			System.out.println("sorry your not add ");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

	
}
