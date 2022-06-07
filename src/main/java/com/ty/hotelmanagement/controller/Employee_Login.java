package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/loginemployee")
public class Employee_Login extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
	    String password = req.getParameter("password");
		
	    if(id.equals(id)&&password.equals(password))
	    {
	    	System.out.println("Employee login successfully ");
	    	RequestDispatcher requestDispatcher = req.getRequestDispatcher("employeeHome.jsp");
	    	requestDispatcher.forward(req, resp);
	    }
	    else
	    {
	    	System.out.println("wrong Id  or Password ");
	    	RequestDispatcher requestDispatcher = req.getRequestDispatcher("employeelogin.jsp");
	    	requestDispatcher.forward(req, resp);
	    }
	}
}
