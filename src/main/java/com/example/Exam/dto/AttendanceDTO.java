package com.example.Exam.dto;

public class AttendanceDTO {

	public AttendanceDTO() {
		// TODO Auto-generated constructor stub
	}

	private int id_employee;
	private String name_employee;
	private int month;
	private int year;
	private int dayoff;
	private int dayon;
	public int getId_employee() {
		return id_employee;
	}
	public void setId_employee(int id_employee) {
		this.id_employee = id_employee;
	}
	public String getName_employee() {
		return name_employee;
	}
	public void setName_employee(String name_employee) {
		this.name_employee = name_employee;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDayoff() {
		return dayoff;
	}
	public void setDayoff(int dayoff) {
		this.dayoff = dayoff;
	}
	public int getDayon() {
		return dayon;
	}
	public void setDayon(int dayon) {
		this.dayon = dayon;
	}
	
	
}
