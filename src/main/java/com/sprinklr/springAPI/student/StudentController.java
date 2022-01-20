package com.sprinklr.springAPI.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentWithID(@PathVariable int id){
        return studentService.getStudentWithID(id);
    }

    //post mappings
    //add a new student
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping("/students/{id}")
    public void removeStudent(@PathVariable int id){
        studentService.removeStudent(id);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody Student s,@PathVariable int id){
        studentService.updateStudent(s,id);
    }

}
