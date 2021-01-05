package com.example.Exam.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Attendance")
public class AttendanceEntity {

	@Id
	@Column(name="id_employee")
	private int id_emp;
	
	@Id
	@Column(name="month")
	private int month;
	
	@Id
	@Column(name="year")
	private int year;
	
	@Column(name="dayoff")
	private Date dayoff;
	
	@Column(name="dayon")
	private Date dayon;
	
	public int getId_emp() {
		return id_emp;
	}

	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
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

	public Date getDayoff() {
		return dayoff;
	}

	public void setDayoff(Date dayoff) {
		this.dayoff = dayoff;
	}

	public Date getDayon() {
		return dayon;
	}

	public void setDayon(Date dayon) {
		this.dayon = dayon;
	}

	public AttendanceEntity() {
		// TODO Auto-generated constructor stub
	}

}
