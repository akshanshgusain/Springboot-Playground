package com.example.learningspringboot.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //Optional<Student> findStudentByEmail(String email);
    //Or more explicit form:
    @Query("SELECT s FROM Student s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email);

}
