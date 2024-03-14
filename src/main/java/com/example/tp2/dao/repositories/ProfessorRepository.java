package com.example.tp2.dao.repositories;

import com.example.tp2.dao.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {

}
