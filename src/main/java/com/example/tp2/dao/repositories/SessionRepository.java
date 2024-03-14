package com.example.tp2.dao.repositories;

import com.example.tp2.dao.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer> {
}
