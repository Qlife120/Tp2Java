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
@Table(name= "Etudiant")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String registration_number;

    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private Collection<Session> sessions;

}
