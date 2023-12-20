package com.example.CollegeManagement.repositories;

import com.example.CollegeManagement.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
