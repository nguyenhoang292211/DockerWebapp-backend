package com.example.Exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Exam.model.AttendanceEntity;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity, Integer> {
	
	@Query(value = "Select * from attendance a where a.year = :year and a.month =:month", nativeQuery = true)
	List<AttendanceEntity> findByYearAndMonth(@Param("year") Integer year, @Param("month") Integer month);
}
