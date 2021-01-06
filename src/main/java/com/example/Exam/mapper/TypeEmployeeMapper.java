package com.example.Exam.mapper;

import org.springframework.stereotype.Component;

import com.example.Exam.dto.TypeEmployeeDTO;
import com.example.Exam.model.TypeEmployeeEntity;

@Component
public class TypeEmployeeMapper {

	 public TypeEmployeeEntity  toEntity (TypeEmployeeDTO typeEmployee)
	 {
		 TypeEmployeeEntity typeEmployeeEntity= new  TypeEmployeeEntity();
		 typeEmployeeEntity.setName(typeEmployee.getName());
		
		 return typeEmployeeEntity;
		 
	 }
	 
	 public TypeEmployeeDTO toDTO (TypeEmployeeEntity typeEmployee)
	 {
		 
		 TypeEmployeeDTO typeEmployeeDTO= new  TypeEmployeeDTO();
		 typeEmployeeDTO.setName(typeEmployeeDTO.getName());
		 
		 return typeEmployeeDTO;
	 }

}
