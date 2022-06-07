package com.ty.hotelmanagement.service;

import java.util.List;

import com.ty.hotelmanagement.dao.RoomDao;
import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.dto.Room;

public class RoomService {
	
	RoomDao roomDao = new RoomDao();
	public Room addRoom(Room room)
	{
		return roomDao.addRoom(room);	
	}
	
	public Room getRoomById(int roomId)
	{
		return roomDao.getRoomById(roomId);
	}
	public List<Room> getAllRooms()
	{
		return roomDao.getAllRooms();
	}
}
