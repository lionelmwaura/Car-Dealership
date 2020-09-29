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

import com.schedule.Course;
import com.schedule.WeekDay;
import com.user.Student;

/**
 * Servlet implementation class SchedulerServlet
 */
@WebServlet("/SchedulerServlet")
public class SchedulerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchedulerServlet() {
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
		ArrayList<Course> courses = (ArrayList<Course>)session.getAttribute("courses");;
		if(courses == null) {
			courses = new ArrayList<Course>();
		}
		
		//Fill in the variables of the course class
		Course newCourse = new Course();
		
		String courseName = request.getParameter("course");
		newCourse.setCourseName(courseName);
		String professor = request.getParameter("professor");
		newCourse.setProfessor(professor);
		String time = request.getParameter("time");
		newCourse.setTime(time);
		String date = request.getParameter("date");
		newCourse.setDate(date);
		
		String room = request.getParameter("room");
		newCourse.setRoom(room);
		
		String[] weekdays = request.getParameterValues("weekday");
		ArrayList<WeekDay> days = new ArrayList<WeekDay>();
		
		for(int i = 0; i < weekdays.length; i++) {
			days.add(WeekDay.valueOf(weekdays[i]));
		}
		newCourse.setOccurrences(days);
		
		//add the course
		courses.add(newCourse);
		session.setAttribute("course", courses);
		RequestDispatcher rs = request.getRequestDispatcher("course.jsp");
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
