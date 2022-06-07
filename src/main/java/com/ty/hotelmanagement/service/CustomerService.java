package com.ty.hotelmanagement.service;

import com.ty.hotelmanagement.dao.CustomerDao;
import com.ty.hotelmanagement.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();
	
	public Customer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}
}
