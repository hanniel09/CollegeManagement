package com.example.CollegeManagement.dtos;

import com.example.CollegeManagement.models.Course;

import java.util.List;

public record StudentDTO(String name, Long age, String expectedGraduation, List<Course> courseList) {
}
