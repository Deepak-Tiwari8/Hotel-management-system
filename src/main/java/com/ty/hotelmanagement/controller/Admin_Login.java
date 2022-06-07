package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/login")
public class Admin_Login extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("admin123@gmail.com")&&password.equals("1234"))
		{
			System.out.println("Admin login successfull");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminHome.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			System.out.println("sorry admin can not login because Email or Password wrong");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
