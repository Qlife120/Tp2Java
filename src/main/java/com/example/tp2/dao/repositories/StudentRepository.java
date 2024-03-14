package com.example.tp2.dao.repositories;

import com.example.tp2.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
