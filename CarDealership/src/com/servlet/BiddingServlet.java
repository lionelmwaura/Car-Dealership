package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.car.Car;

/**
 * Servlet implementation class BiddingServlet
 */
@WebServlet("/BiddingServlet")
public class BiddingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BiddingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Car car = (Car)session.getAttribute("car");;
		
		LocalDate now = LocalDate.now();
		LocalDate inDate = LocalDate.parse(car.getInDate());
		
		long diff = ChronoUnit.DAYS.between(now, inDate);
		
		double price = car.getPrice();
		double currentBid = car.getBid();
		double bid = 0;
		
		try {
			bid = Double.parseDouble(request.getParameter("bid"));
		} catch (Exception e) {
			System.out.println("Must be a number.");
		}
		
		
		if(diff >= 120) { 
			 price = price * .9; 
		}
		 
		
		
	if (bid > currentBid) {
		car.setBid(bid);
	}
		
		
		if (bid < price) {
			session.setAttribute("car", car);
			RequestDispatcher rs = request.getRequestDispatcher("viewDetails.jsp");
				rs.forward(request,response);
		} else {
			car.setPrice(bid);
			car.setBought(true);
			
			session.setAttribute("car", car);
			RequestDispatcher rs = request.getRequestDispatcher("payHere.jsp");
				rs.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
