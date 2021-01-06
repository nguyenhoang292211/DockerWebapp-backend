package com.example.Exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exam.dto.TypeEmployeeDTO;
import com.example.Exam.service.TypeEmployeeService;

@SuppressWarnings("unused")
@RestController

public class TypeEmployeeController {

	@Autowired
	private TypeEmployeeService typeEmployeeService;
	
	@PostMapping("/typeEmployee")	
	public TypeEmployeeDTO save(@RequestBody TypeEmployeeDTO position)
	{
		return typeEmployeeService.save(position);
	}
	
	@GetMapping("/findAllPosition")
	public List<TypeEmployeeDTO> findall()
	{
		return typeEmployeeService.findAll();
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
