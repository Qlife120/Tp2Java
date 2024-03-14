package com.example.tp2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp2.dao.entities.Course;
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
