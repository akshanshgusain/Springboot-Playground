package com.example.learningspringboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
    
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long id,
            @RequestParam(required = true) String name,
            @RequestParam(required = true) String email
    ){
        studentService.updateStudent(id, name, email);
    }
}
