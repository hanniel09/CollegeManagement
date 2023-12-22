package com.example.CollegeManagement.services;

import com.example.CollegeManagement.dtos.StudentDTO;
import com.example.CollegeManagement.exceptions.RecordNotFoundException;
import com.example.CollegeManagement.models.Student;
import com.example.CollegeManagement.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    public Student findStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Student createStudent(StudentDTO data){
        Student student = new Student(data);
        return studentRepository.save(student);
    }

}
