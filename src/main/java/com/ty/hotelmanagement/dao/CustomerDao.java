package com.ty.hotelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotelmanagement.dto.Customer;

public class CustomerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	

	public Customer addCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
}
