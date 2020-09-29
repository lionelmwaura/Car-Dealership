package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.Customer;
import com.car.Car;
import com.customer.Address;


/**
 * Servlet implementation class addCustomerServlet
 */
@WebServlet("/addCustomerServlet")
public class addCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		Car car = (Car)session.getAttribute("car");;
		
		Customer customer = new Customer();
		customer.setEmail(request.getParameter("email"));
		customer.setFirstName(request.getParameter("firstName"));
		customer.setLastName(request.getParameter("lastName"));
		customer.setPassword(request.getParameter("password"));
		
		Address address = new Address();
		address.setCity("city");
		address.setEmail("email");
		address.setState("state");
		address.setStreet("street");
		address.setZipCode("zipCode");
	
		customer.setAddress(address);
		customer.setvId(car.getvId());
		
		ArrayList<Customer> customers = (ArrayList<Customer>)session.getAttribute("customers");;
		if(customers == null) {
			customers = new ArrayList<Customer>();
		}
		
		customers.add(customer);
		
		session.setAttribute("customers", customers);
		 
		RequestDispatcher rs = request.getRequestDispatcher("reports.jsp");
		rs.forward(request,response);
	}

}
