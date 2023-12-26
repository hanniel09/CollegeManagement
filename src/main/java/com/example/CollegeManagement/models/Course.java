package com.example.CollegeManagement.models;

import com.example.CollegeManagement.dtos.CourseDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column
    private String name;

    @Column
    private String duration;


    public Course() {
    }

    public Course(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public Course(CourseDTO data){
        this.name = data.name();
        this.duration = data.duration();
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long id) {
        this.courseId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
