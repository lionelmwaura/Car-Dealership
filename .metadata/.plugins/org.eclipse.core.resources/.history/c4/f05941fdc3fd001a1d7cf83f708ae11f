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

import com.car.Car;

/**
 * Servlet implementation class ViewDetailsServlet
 */
@WebServlet("/ViewDetailsServlet")
public class ViewDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get array of cars
		HttpSession session = request.getSession(true);
		ArrayList<Car> cars = (ArrayList<Car>)session.getAttribute("cars");;
		
		String vId = request.getParameter("Id");
		
		Car car = null;
		
		for( Car sCar : cars) {
			if(vId.equals(sCar.getvId())) {
				car =  sCar;
			}
		}
			
		session.setAttribute("car", car);
		RequestDispatcher rs = request.getRequestDispatcher("viewDetails.jsp");
		rs.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
