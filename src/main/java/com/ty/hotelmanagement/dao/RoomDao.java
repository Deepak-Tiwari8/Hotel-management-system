package com.ty.hotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.dto.Room;

public class RoomDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Room addRoom(Room room)
	{
		entityTransaction.begin();
		entityManager.persist(room);
		entityTransaction.commit();
		return room;
	}
	public Room getRoomById(int roomId)
	{
		   entityTransaction.begin();
		return  entityManager.find(Room.class, roomId);
		
	}
	public List<Room> getAllRooms()
	{
		String sql = "select r from Room r";
		Query query  = entityManager.createQuery(sql);
		return query.getResultList();
	}
}
