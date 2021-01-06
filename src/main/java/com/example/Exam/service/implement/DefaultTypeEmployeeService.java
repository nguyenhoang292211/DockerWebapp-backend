package com.example.Exam.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Exam.dto.TypeEmployeeDTO;
import com.example.Exam.mapper.TypeEmployeeMapper;
import com.example.Exam.model.TypeEmployeeEntity;
import com.example.Exam.repository.TypeEmployeeRepositotry;
import com.example.Exam.service.TypeEmployeeService;

public class DefaultTypeEmployeeService implements TypeEmployeeService{

	public DefaultTypeEmployeeService() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired	
	private TypeEmployeeRepositotry typeEmployeeEntityRepository;
	
	@Autowired
	private TypeEmployeeMapper typeEmployeeEntityMapper;
	
	@Override
	public TypeEmployeeDTO save(TypeEmployeeDTO typeEmployee) {
		
		TypeEmployeeEntity typeEmployeeEntity = typeEmployeeEntityMapper.toEntity(typeEmployee);	
		return typeEmployeeEntityMapper.toDTO(typeEmployeeEntityRepository.save(typeEmployeeEntity));
	}
	
	@Override
	public List<TypeEmployeeDTO> findAll()
	{
		List<TypeEmployeeEntity> listTypeEmployee= typeEmployeeEntityRepository.findAll();
		List<TypeEmployeeDTO> listTypeEmployeeDTO= new ArrayList<TypeEmployeeDTO>();
		for(int i=0; i<listTypeEmployee.size();i++)
		{
			listTypeEmployeeDTO.add(typeEmployeeEntityMapper.toDTO(listTypeEmployee.get(i)));
		}
			
		return  listTypeEmployeeDTO;
	}
}
