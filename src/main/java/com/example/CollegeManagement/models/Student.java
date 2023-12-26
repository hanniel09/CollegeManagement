package com.example.CollegeManagement.models;


import com.example.CollegeManagement.dtos.StudentDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column
    private String name;

    @Column
    private Long age;

    @Column(name = "expected_graduation")
    private String expectedGraduation;

    @ManyToMany
    @JoinTable(name = "StudentCourses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courseList;

    public Student() {
    }

    public Student(String name, Long age, String expectedGraduation, List<Course> courseList) {
        this.name = name;
        this.age = age;
        this.expectedGraduation = expectedGraduation;
        this.courseList = courseList;
    }

    public Student(StudentDTO data) {
        this.name = data.name();
        this.age = data.age();
        this.expectedGraduation = data.expectedGraduation();
        this.courseList = data.courseList();
    }



    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long id) {
        this.studentId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getExpectedGraduation() {
        return expectedGraduation;
    }

    public void setExpectedGraduation(String expectedGraduation) {
        this.expectedGraduation = expectedGraduation;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
