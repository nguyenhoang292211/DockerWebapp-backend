package com.example.Exam.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Exam.dto.AttendanceDTO;
import com.example.Exam.mapper.AttendanceMapper;
import com.example.Exam.model.AttendanceEntity;
import com.example.Exam.repository.AttendanceRepository;
import com.example.Exam.service.AttendanceService;


public class DefaultAttendanceService implements AttendanceService{

	public DefaultAttendanceService() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired	
	private AttendanceRepository attendanceEntityRepository;
	
	@Autowired
	private AttendanceMapper attendanceEntityMapper;
	
	@Override
	public AttendanceDTO save(AttendanceDTO attendance) {
		
		AttendanceEntity departmentEntity = attendanceEntityMapper.toEntity(attendance);	
		return attendanceEntityMapper.toDTO(attendanceEntityRepository.save(departmentEntity));
	}
	
	@Override
	public List<AttendanceDTO> findAll()
	{
		List<AttendanceEntity> listAtt= attendanceEntityRepository.findAll();
		List<AttendanceDTO> listAttDTO= new ArrayList<AttendanceDTO>();
		for(int i=0; i<listAtt.size();i++)
		{
			listAttDTO.add(attendanceEntityMapper.toDTO(listAtt.get(i)));
		}
			
		return  listAttDTO;
	}
	

	@Override
	public List<AttendanceDTO> findByYearAndMonth(int year, int month)
	{
		List<AttendanceEntity> listAtt= attendanceEntityRepository.findByYearAndMonth(year, month);
		List<AttendanceDTO> listAttDTO= new ArrayList<AttendanceDTO>();
		for(int i=0; i<listAtt.size();i++)
		{
			listAttDTO.add(attendanceEntityMapper.toDTO(listAtt.get(i)));
		}
			
		return  listAttDTO;
	}
}
