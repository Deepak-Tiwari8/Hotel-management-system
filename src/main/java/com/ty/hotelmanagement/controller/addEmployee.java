package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Employee;
import com.ty.hotelmanagement.service.EmployeeService;
@WebServlet(value = "/addemployee")
public class addEmployee extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String employeeName = req.getParameter("employeeName");
		String employeeJob = req.getParameter("employeeJob");
		long employeePhone = Long.parseLong(req.getParameter("employeePhone"));
		 String employeePassword = req.getParameter("employeePassword");
		 String employeeEmail = req.getParameter("employeeEmail");
		 
		 Employee employee = new Employee();
		 employee.setEmployeeName(employeeName);
		 employee.setEmployeeJob(employeeJob);
		 employee.setEmployeePhone(employeePhone);
		 employee.setEmployeePassword(employeePassword);
		 employee.setEmployeeEmail(employeeEmail);
		 
		 EmployeeService employeeService = new EmployeeService();
		 Employee employee1 = employeeService.addEmployee(employee);
		 
		 if(employee1!=null)
		 {
			 System.out.println("Add employee successfully");
			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("addEmployee.jsp");
			 requestDispatcher.forward(req, resp);
		 }
		 else
		 {
			 System.out.println("sorry employee is not added");
			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			 requestDispatcher.forward(req, resp);
		 }
	} 
}
