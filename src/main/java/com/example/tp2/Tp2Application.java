package com.example.tp2;

import com.example.tp2.dao.entities.Course;
import com.example.tp2.dao.entities.Professor;
import com.example.tp2.dao.entities.Session;
import com.example.tp2.dao.entities.Student;
import com.example.tp2.dao.repositories.CourseRepository;
import com.example.tp2.dao.repositories.ProfessorRepository;
import com.example.tp2.dao.repositories.SessionRepository;
import com.example.tp2.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Ahmed");
        s1.setRegistration_number("A11");
        s2.setName("Aziz");
        s2.setRegistration_number("A22");

        Session session1 = new Session();
        Session session2 = new Session();
        Date d1 = new Date(100,0,1);
        Date d2 = new Date(101,5,10);
        Date h_debut_1 = new Date(101,10,8);
        Date h_fin_1 = new Date(119,1,9);
        Date h_debut_2 = new Date(101,10,8);
        Date h_fin_2 = new Date(119,1,9);
        session1.setDate(d1);
        session2.setDate(d2);
        session1.setH_debut(h_debut_1);
        session1.setH_fin(h_fin_1);
        session2.setH_debut(h_debut_2);
        session2.setH_fin(h_fin_2);

        Course c1 = new Course();
        Course c2 = new Course();
        c1.setDescription("Cours de Mathematiques.");
        c2.setDescription("Cours de Physique.");
        c1.setTitle("Maths");
        c2.setTitle("Physics");

        Professor p1 = new Professor();
        Professor p2 = new Professor();

        p1.setNom("Mohammed");
        p2.setNom("Seddiq");
        Date d_assignment_1 = new Date(112,3,20);
        Date d_assignment_2 = new Date(112,3,20);
        p1.setD_assignment(d_assignment_1);
        p2.setD_assignment(d_assignment_2);
        p1.setCourse(c1);
        p2.setCourse(c2);

        Collection<Session> sessions = new ArrayList<Session>();
        sessions.add(session1);
        sessions.add(session2);
        Collection<Student> students  = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);

        studentRepository.save(s1);
        studentRepository.save(s2);
        sessionRepository.save(session1);
        sessionRepository.save(session2);
        courseRepository.save(c1);
        courseRepository.save(c2);
        session2.setStudents(students);
        c1.setSessions(sessions);
        c2.setSessions(sessions);
        session1.setCourse(c1);
        session2.setCourse(c2);
        studentRepository.save(s1);
        studentRepository.save(s2);
        sessionRepository.save(session1);
        sessionRepository.save(session2);
        courseRepository.save(c1);
        courseRepository.save(c2);
        professorRepository.save(p1);
        professorRepository.save(p2);




    }
}
