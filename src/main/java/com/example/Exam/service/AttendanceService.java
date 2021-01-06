package com.example.Exam.service;

import java.util.List;

import com.example.Exam.dto.AttendanceDTO;

public interface AttendanceService {
	
	AttendanceDTO save (AttendanceDTO attendance);
		
		List<AttendanceDTO> findAll();
		List<AttendanceDTO> findByYearAndMonth(int year, int month);
}
