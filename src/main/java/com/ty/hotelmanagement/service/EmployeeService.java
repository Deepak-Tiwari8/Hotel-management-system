package com.ty.hotelmanagement.service;

import com.ty.hotelmanagement.dao.EmployeeDao;
import com.ty.hotelmanagement.dto.Employee;

public class EmployeeService {

	 EmployeeDao  employeeDao = new  EmployeeDao();
		
		public Employee addEmployee(Employee employee) {
			return employeeDao.addEmployee(employee) ;
		}
}
