package com.ty.hotelmanagement.service;

import com.ty.hotelmanagement.dao.HotelDao;
import com.ty.hotelmanagement.dto.Hotel;

public class HotelService {
	
	HotelDao hotelDao = new HotelDao();
	
	public Hotel addHotel(Hotel hotel) {
		return hotelDao.addHotel(hotel);
	}
	
	public Hotel getHotel(int hotelId,Hotel hotel)
	{
		return hotelDao.getHotel(hotelId, hotel);
		
	}
}
