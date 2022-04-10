package com.victor.Matricula.service;

import com.victor.Matricula.model.Student;

import java.util.List;

public interface StudentService {
    // vamos implementar o saveStudent no StudentServiceImple.
    public Student saveStudent(Student Student);
    public List<Student> getAllStudents();


}
