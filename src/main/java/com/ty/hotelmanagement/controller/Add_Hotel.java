package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.service.HotelService;

@WebServlet(value = "/addhotel")
public class Add_Hotel extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String hotelName = req.getParameter("hotelName");
		String hotelAddress = req.getParameter("hotelAddress");
		String hotelType = req.getParameter(" hotelType");
		String hotelwebsite = req.getParameter("hotelwebsite");
		long hotelPhone = Long.parseLong(req.getParameter("hotelPhone"));
 
		
		
		Hotel hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setHotelAddress(hotelAddress);
		hotel.setHotelType(hotelType);
		hotel.setHotelPhone(hotelPhone);
		hotel.setHotlewebsite(hotelwebsite);
		
		
		HotelService hotelService = new HotelService();
		Hotel hotel1 = hotelService.addHotel(hotel);
		if(hotel1!=null)
		{
			System.out.println("Add Hotel Successfully");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("addHotel.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			System.out.println("Sorry we are not able to Add Hotel");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}

