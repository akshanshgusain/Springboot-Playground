package com.example.learningspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{
            Student samantha = new Student(

                    "Samantha Wheeler",

                    LocalDate.of(1985, Month.APRIL, 12),
                    "samanthawheeler@gmail.com"
            );
            Student alex = new Student(

                    "Alex Cook",

                    LocalDate.of(1982, Month.OCTOBER, 2),
                    "alexcook@gmail.com"
            );

            studentRepository.saveAll(
                    List.of(
                            samantha, alex
                    )
            );
        };
    }
}
