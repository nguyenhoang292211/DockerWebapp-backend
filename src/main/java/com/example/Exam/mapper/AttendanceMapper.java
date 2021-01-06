package com.example.Exam.mapper;

import org.springframework.stereotype.Component;

import com.example.Exam.dto.AttendanceDTO;
import com.example.Exam.model.AttendanceEntity;

@Component
public class AttendanceMapper {

	
	public AttendanceEntity  toEntity (AttendanceDTO attendance)
	 {
		AttendanceEntity attendanceEntity= new  AttendanceEntity();
		attendanceEntity.setId_emp(attendance.getId_employee());
		attendanceEntity.setNameEmployee(attendance.getName_employee());
		attendanceEntity.setYear(attendance.getYear());
		attendanceEntity.setMonth(attendance.getMonth());
		attendanceEntity.setDayoff(attendance.getDayoff());
		attendanceEntity.setDayon(attendance.getDayon());
		 return attendanceEntity;
		 
	 }
	 
	 public AttendanceDTO toDTO (AttendanceEntity att)
	 {
		 
		 AttendanceDTO attDTO= new  AttendanceDTO();
		attDTO.setId_employee(att.getId_emp());
		attDTO.setName_employee(att.getNameEmployee());
		attDTO.setMonth(att.getMonth());
		attDTO.setYear(att.getYear());
		attDTO.setDayoff(att.getDayoff());
		attDTO.setDayon(att.getDayon());
		
		 return attDTO;
	 }
}
