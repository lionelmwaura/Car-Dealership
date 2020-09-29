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
 * Servlet implementation class TaxServlet
 */
@WebServlet("/TaxServlet")
public class TaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stringIncome = request.getParameter("income");
		String status = request.getParameter("status");
		double income = Double.parseDouble(stringIncome);
		double tax = 0;
		int choice = 0;
		
		if(status.equals("Unmarried")) {
			choice = 1;
		} else if(status.equals("Married")) {
			choice = 2;
		} else if(status.equals("HeadOfHouse")) {
			choice = 3;
		}
		
		switch(choice) {
			case 1:{
				if(income <= 9700 ) {
					tax = .10;
				} 
				else if ( income > 9700 && income <= 39475) {
					tax = .12;
				} 
				else if (income > 39475 && income <= 84200) {
					tax = .22;
				} 
				else if (income > 84200 && income <= 160725){
					tax = .24;
				} 
				else if (income > 160725 && income <= 204100) {
					tax = .32;
				}
				else if (income > 204100 && income <= 510300) {
					tax = .35;
				} else {
					tax = .37;
				}
			}
			case 2:{
				if(income <= 19400 ) {
					tax = .10;
				} 
				else if ( income > 19400 && income <= 78950) {
					tax = .12;
				} 
				else if (income > 78950 && income <= 168400) {
					tax = .22;
				} 
				else if (income > 168400 && income <= 321450){
					tax = .24;
				} 
				else if (income > 321450 && income <= 408200) {
					tax = .32;
				}
				else if (income > 408200 && income <= 612350) {
					tax = .35;
				} else {
					tax = .37;
				}
			}
			case 3:{
			if(income <= 13850 ) {
				tax = .10;
			} 
			else if ( income > 13850 && income <= 52850) {
				tax = .12;
			} 
			else if (income > 52850 && income <= 84200) {
				tax = .22;
			} 
			else if (income > 84200 && income <= 160700){
				tax = .24;
			} 
			else if (income > 160700 && income <= 204100) {
				tax = .32;
			}
			else if (income > 204100 && income <= 510300) {
				tax = .35;
			} else {
				tax = .37;
			}
		}
	}
		double incomeTax = income * tax;
		double roundIncomeTax = Math.round(incomeTax * 100.0) / 100.0;
		
		HttpSession session = request.getSession(true);
		Student student = (Student)session.getAttribute("student");
		student.setTax(roundIncomeTax);
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
