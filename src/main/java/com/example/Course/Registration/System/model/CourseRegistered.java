package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseRegistered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;//no need to provide the value
    private String name;
    private String emailId;
    private String courseName;

    public CourseRegistered(String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }

    public CourseRegistered() {

    }
}
