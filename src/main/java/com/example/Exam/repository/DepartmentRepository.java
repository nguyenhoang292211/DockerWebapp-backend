package com.example.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Exam.model.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

}
