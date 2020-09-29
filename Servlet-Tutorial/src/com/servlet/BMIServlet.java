package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Student;

/**
 * Servlet implementation class BMIServlet
 */
@WebServlet("/BMIServlet")
public class BMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		
		double heightSquare = ((Double.parseDouble(height) * .025) * (Double.parseDouble(height) * .025));
		double bMI = (Double.parseDouble(weight) * 0.45) / heightSquare;
				
		double roundBMI = Math.round(bMI * 100.0) / 100.0;

		
		HttpSession session = request.getSession(true);
		Student student = (Student)session.getAttribute("student");
		student.setbMI(roundBMI);
		session.setAttribute("student", student);
		RequestDispatcher rs = request.getRequestDispatcher("account.jsp");
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
