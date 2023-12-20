package com.example.CollegeManagement.repositories;

import com.example.CollegeManagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
