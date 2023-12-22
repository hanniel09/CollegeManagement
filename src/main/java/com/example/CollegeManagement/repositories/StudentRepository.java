package com.example.CollegeManagement.repositories;

import com.example.CollegeManagement.models.Course;
import com.example.CollegeManagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Course> findCourses(List<Course> courseList);
}
