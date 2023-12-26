package com.example.CollegeManagement.controllers;

import com.example.CollegeManagement.dtos.CourseDTO;
import com.example.CollegeManagement.models.Course;
import com.example.CollegeManagement.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping()
    public ResponseEntity<List<Course>> findAllCourses(){
        return new ResponseEntity<>(courseService.findAllCourses(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Course> findCoursesById(@PathVariable Long id){
        return new ResponseEntity<>(courseService.findCourseById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Course> createCourse(@RequestBody CourseDTO courseDTO){
        return new ResponseEntity<>(courseService.createCourse(courseDTO), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Course> updateCourse(@RequestBody CourseDTO courseDTO, @PathVariable Long id){
        return new ResponseEntity<>(courseService.updateCourse(courseDTO, id), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
