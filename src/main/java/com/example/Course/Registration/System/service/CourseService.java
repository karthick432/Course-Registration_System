package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistered;
import com.example.Course.Registration.System.repository.CourseRegisteredRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegisteredRepo courseRegisteredRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistered> enrolledStudents() {
        return courseRegisteredRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistered courseRegistered = new CourseRegistered(name,emailId,courseName);
        courseRegisteredRepo.save(courseRegistered);
    }
}
