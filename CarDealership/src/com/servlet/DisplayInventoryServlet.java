package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

import com.car.Camry;
import com.car.Car;
import com.car.Corolla;
import com.car.Inventory;


/**
 * Servlet implementation class SearchInventoryServlet
 */
@WebServlet("/DisplayInventoryServlet")
public class DisplayInventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayInventoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		//Check if the array is null
		ArrayList<Car> cars = (ArrayList<Car>)session.getAttribute("cars");;
		if(cars == null) {
			cars = new ArrayList<Car>();
		}
		
		Inventory inventory = new Inventory(cars);
		
		cars = inventory.getCars();
		
		
		
		session.setAttribute("cars", cars);
		RequestDispatcher rs = request.getRequestDispatcher("searchCar.jsp");
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