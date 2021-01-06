package com.example.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Exam.model.TypeEmployeeEntity;

public interface TypeEmployeeRepositotry extends JpaRepository<TypeEmployeeEntity, Integer> {

	
}
