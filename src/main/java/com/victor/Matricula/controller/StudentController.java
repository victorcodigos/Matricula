package com.victor.Matricula.controller;

import com.victor.Matricula.model.Student;
import com.victor.Matricula.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.String;

import java.util.List;


@RestController
@RequestMapping ("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {

        studentService.saveStudent(student);
        return "New student added!";
    }
     @GetMapping("/getAll")
      public List<Student> getAllStudents(){
       return studentService.getAllStudents();
    }


    @PutMapping("/updateStudent")
    public Student updateStudent (@RequestBody Student student){
        return  studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.deleteById(id);


    }
}


