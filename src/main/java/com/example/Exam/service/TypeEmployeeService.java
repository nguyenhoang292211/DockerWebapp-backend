package com.example.Exam.service;

import java.util.List;

import com.example.Exam.dto.TypeEmployeeDTO;

public interface TypeEmployeeService {


TypeEmployeeDTO save (TypeEmployeeDTO typeEmployee);
	
	List<TypeEmployeeDTO> findAll();
	
//	TypeEmployeeDTO findPositionById(int id);
//	
//	void deletePositionById(int id);
}
