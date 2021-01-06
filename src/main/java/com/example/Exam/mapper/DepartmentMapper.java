package com.example.Exam.mapper;

import org.springframework.stereotype.Component;

import com.example.Exam.dto.DepartmentDTO;
import com.example.Exam.model.DepartmentEntity;

@Component
public class DepartmentMapper {

	 public DepartmentEntity  toEntity (DepartmentDTO department)
	 {
		 DepartmentEntity departmentEntity= new  DepartmentEntity();
		 departmentEntity.setName(department.getName());
		 
		 return departmentEntity;
		 
	 }
	 
	 public DepartmentDTO toDTO (DepartmentEntity department)
	 {
		 
		 DepartmentDTO departmentDTO= new  DepartmentDTO();
		 departmentDTO.setName(department.getName());
		
		 return departmentDTO;
	 }

}
