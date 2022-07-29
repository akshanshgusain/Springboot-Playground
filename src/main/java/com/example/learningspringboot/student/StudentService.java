package com.example.learningspringboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Akshansh Gusain",
                        27,
                        LocalDate.of(1995, Month.JANUARY, 1),
                        "akshanshgusain@gmail.com"
                ),
                new Student(
                        2L,
                        "Aditya Chauhan",
                        22,
                        LocalDate.of(2000, Month.AUGUST, 30),
                        "akshanshgusain@gmail.com"
                )
        );
    }
}
