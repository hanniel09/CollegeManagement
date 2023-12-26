package com.example.CollegeManagement.services;

import com.example.CollegeManagement.dtos.CourseDTO;
import com.example.CollegeManagement.exceptions.RecordNotFoundException;
import com.example.CollegeManagement.models.Course;
import com.example.CollegeManagement.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }

    public Course findCourseById(Long id){
        return courseRepository.findById(id).orElseThrow(()
                -> new RecordNotFoundException(id));
    }

    @Transactional
    public Course createCourse(CourseDTO data){
        Course course = new Course(data);
        return courseRepository.save(course);
    }

    public Course updateCourse(CourseDTO data, Long id){
        Course newCourse = new Course(data);
        Course courseSaved = findCourseById(id);
        newCourse.setCourseId(courseSaved.getCourseId());
        return courseRepository.save(newCourse);
    }

    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }


}
