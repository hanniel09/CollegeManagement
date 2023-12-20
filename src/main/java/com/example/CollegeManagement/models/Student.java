package com.example.CollegeManagement.models;


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
