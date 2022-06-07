package com.ty.hotelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotelmanagement.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Employee addEmployee(Employee employee)
	{
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
}
