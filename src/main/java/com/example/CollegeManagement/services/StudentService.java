package com.example.CollegeManagement.services;

import com.example.CollegeManagement.dtos.StudentDTO;
import com.example.CollegeManagement.exceptions.RecordNotFoundException;
import com.example.CollegeManagement.models.Student;
import com.example.CollegeManagement.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public Student createStudent(StudentDTO data){
        Student student = new Student(data);
        return studentRepository.save(student);
    }

    public Student updateStudent(StudentDTO data, Long id){
        Student newStudent = new Student(data);
        Student updateStudent = findStudentById(id);
        newStudent.setStudentId(updateStudent.getStudentId());
        return studentRepository.save(newStudent);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

}
