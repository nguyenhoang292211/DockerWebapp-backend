package com.example.Exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.Exam.dto.AttendanceDTO;
import com.example.Exam.service.AttendanceService;

@SuppressWarnings("unused")
@RestController

public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping("/department")	
	public AttendanceDTO save(@RequestBody AttendanceDTO department)
	{
		return attendanceService.save(department);
	}
	
	@GetMapping("/findAllDepartment/{year}/{month}")
	public List<AttendanceDTO> findallbyyearandmonth(@PathVariable int year,@PathVariable int month )
	{
		return attendanceService.findByYearAndMonth(year, month);
	}
	
	
	
//	@GetMapping("/employee/find/{id}")
//	public TypeEmployeeDTO findById(@PathVariable int id)
//	{
//		return employeeService.findById(id);
//	}
//	
//	@DeleteMapping("/employee/{id}")
//	public void deleteEmployee(@PathVariable int id)
//	{
//		employeeService.deleteById(id);
//	}
}

