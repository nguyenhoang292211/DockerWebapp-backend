package com.example.Exam.service;

import java.util.List;

import com.example.Exam.dto.DepartmentDTO;

public interface DepartmentService {


	DepartmentDTO save (DepartmentDTO typeEmployee);
	
	List<DepartmentDTO> findAll();
	
//	TypeEmployeeDTO findPositionById(int id);
//	
//	void deletePositionById(int id);
}
