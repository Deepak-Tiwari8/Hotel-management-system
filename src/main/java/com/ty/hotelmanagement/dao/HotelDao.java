package com.ty.hotelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotelmanagement.dto.Hotel;

public class HotelDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Hotel addHotel(Hotel hotel)
	{
		entityTransaction.begin();
		entityManager.persist(hotel);
		entityTransaction.commit();
		return hotel;
	}
	
	
	public Hotel getHotel(int hotelId,Hotel hotel)
	{
		return hotel;
		
	}
}
