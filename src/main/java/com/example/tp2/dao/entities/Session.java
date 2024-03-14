package com.example.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Date date;
    private Date h_debut;
    private Date h_fin;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students;

    @ManyToOne
    private Course course;
}
