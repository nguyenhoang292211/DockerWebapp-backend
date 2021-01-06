package com.example.Exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exam.dto.DepartmentDTO;
import com.example.Exam.service.DepartmentService;

@SuppressWarnings("unused")
@RestController

public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")	
	public DepartmentDTO save(@RequestBody DepartmentDTO department)
	{
		return departmentService.save(department);
	}
	
	@GetMapping("/findAllDepartment")
	public List<DepartmentDTO> findall()
	{
		return departmentService.findAll();
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
