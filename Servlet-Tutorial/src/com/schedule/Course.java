package com.schedule;

import java.sql.Date;
import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private String professor;
	private ArrayList<WeekDay> occurrences;
	private String time;
	private String room;
	private String date;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public ArrayList<WeekDay> getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(ArrayList<WeekDay> occurrences) {
		this.occurrences = occurrences;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

	
}
