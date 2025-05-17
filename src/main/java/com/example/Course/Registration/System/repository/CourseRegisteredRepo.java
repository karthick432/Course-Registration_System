package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegistered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisteredRepo extends JpaRepository<CourseRegistered,Integer> {
}
