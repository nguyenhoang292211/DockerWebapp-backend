package com.example.Exam.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.Exam.dto.EmployeeDTO;

@Entity
@Table (name="Attendance")
public class AttendanceEntity {
	
	@ManyToOne
    @JoinColumn(name = "id_employee")
    private EmployeeDTO emp;
	
	public EmployeeDTO getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDTO emp) {
		this.emp = emp;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	private String nameEmployee;
	
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
	private int dayoff;
	
	@Column(name="dayon")
	private int dayon;
	
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

	public AttendanceEntity() {
		// TODO Auto-generated constructor stub
	}

}
