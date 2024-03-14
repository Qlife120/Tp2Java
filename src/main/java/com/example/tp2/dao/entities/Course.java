package com.example.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="Cours")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @OneToMany(mappedBy="course")
    private Collection<Session> sessions;

    @OneToOne(mappedBy= "course")
    private Professor professor;
}
