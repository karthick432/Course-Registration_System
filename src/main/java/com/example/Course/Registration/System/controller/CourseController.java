package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistered;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistered> enrolledStudents(){
        return courseService.enrolledStudents();
    }
    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam ("name") String name, @RequestParam("emailId") String emailId, @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations! "+name+" Enrollement Successful for "+courseName;
    }
}
