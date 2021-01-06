package com.example.Exam.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Exam.dto.DepartmentDTO;
import com.example.Exam.mapper.DepartmentMapper;
import com.example.Exam.model.DepartmentEntity;
import com.example.Exam.repository.DepartmentRepository;
import com.example.Exam.service.DepartmentService;


public class DefaultDepartmentService implements DepartmentService{

	public DefaultDepartmentService() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired	
	private DepartmentRepository departmentEntityRepository;
	
	@Autowired
	private DepartmentMapper departmentEntityMapper;
	
	@Override
	public DepartmentDTO save(DepartmentDTO department) {
		
		DepartmentEntity departmentEntity = departmentEntityMapper.toEntity(department);	
		return departmentEntityMapper.toDTO(departmentEntityRepository.save(departmentEntity));
	}
	
	@Override
	public List<DepartmentDTO> findAll()
	{
		List<DepartmentEntity> listDepartment= departmentEntityRepository.findAll();
		List<DepartmentDTO> listDepartmentDTO= new ArrayList<DepartmentDTO>();
		for(int i=0; i<listDepartment.size();i++)
		{
			listDepartmentDTO.add(departmentEntityMapper.toDTO(listDepartment.get(i)));
		}
			
		return  listDepartmentDTO;
	}
}