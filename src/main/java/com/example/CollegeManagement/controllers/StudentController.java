package com.example.CollegeManagement.controllers;

import com.example.CollegeManagement.dtos.StudentDTO;
import com.example.CollegeManagement.models.Student;
import com.example.CollegeManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping()
    public ResponseEntity<List<Student>> findAllStudents(){
        return new ResponseEntity<>(studentService.findAllStudents(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable Long id){
        return new ResponseEntity<>(studentService.findStudentById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Student> createStudent(@RequestBody StudentDTO data){
        return new ResponseEntity<>(studentService.createStudent(data), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody StudentDTO data, @PathVariable Long id){
        return new ResponseEntity<>(studentService.updateStudent(data, id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
