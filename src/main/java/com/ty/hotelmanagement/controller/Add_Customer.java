
package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Customer;
import com.ty.hotelmanagement.service.CustomerService;

@WebServlet(value = "/addCust")
public class Add_Customer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String customerName = req.getParameter("customerName");
		String customeremail = req.getParameter("customeremail");
		long customerphon = Long.parseLong(req.getParameter("customerphon"));
		String customergender = req.getParameter("customergender");
		String customerpassword = req.getParameter("customerpassword");

		Customer customer = new Customer();
		customer.setCustomerName(customerName);
		customer.setCustomeremail(customeremail);
		customer.setCustomerphone(customerphon);
		customer.setCustomergender(customergender);
		customer.setCustomerpassword(customerpassword);

		CustomerService customerService = new CustomerService();
		Customer customer1 = customerService.addCustomer(customer);

		if (customer1!= null) {
			System.out.println("Add customer succcesfully");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("addcustomer.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			System.out.println("Sorry we are not add customer");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("customerHome.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
